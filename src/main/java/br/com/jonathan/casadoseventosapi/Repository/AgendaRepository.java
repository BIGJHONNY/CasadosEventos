package br.com.jonathan.casadoseventosapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonathan.casadoseventosapi.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{

}
