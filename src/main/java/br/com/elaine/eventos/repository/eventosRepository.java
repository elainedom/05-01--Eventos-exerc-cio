package br.com.elaine.eventos.repository;

import br.com.elaine.eventos.model.eventosModel;
import org.springframework.data.repository.CrudRepository;

public interface eventosRepository extends CrudRepository<eventosModel, String> {

}
