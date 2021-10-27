package br.com.jonathan.casadoseventosapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonathan.casadoseventosapi.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{

}
