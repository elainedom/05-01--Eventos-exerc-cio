package br.com.elaine.eventos.service;
import br.com.elaine.eventos.model.eventosModel;
import br.com.elaine.eventos.repository.eventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class eventosService {

    @Autowired
    private eventosRepository repository;


    public eventosModel cadastrarEvento(eventosModel evento) {
        evento.setAtivo(Boolean.TRUE);
        evento.setDataCriacao(LocalDate.now());
        return repository.save(evento);
    }

}
