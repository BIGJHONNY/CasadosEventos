package br.com.jonathan.casadoseventosapi.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonathan.casadoseventosapi.Repository.AgendaRepository;
import br.com.jonathan.casadoseventosapi.model.Agenda;



@RestController
@RequestMapping("/Agenda")
public class AgendaController {
	
	@Autowired
	public AgendaRepository ar;
	
	@GetMapping("/listar")
	public List<Agenda> Listar(){
		return ar.findAll();			
	}
	
	@PostMapping("/Cadastro")
	public String cadastro(@RequestBody Agenda agenda) {
		ar.save(agenda);
		return "cadastro realizado com sucesso";
	}
	
	@PutMapping("/Atualizar/{id}")
	public String atualizar(@RequestBody Agenda agenda, @PathVariable Long id) {
		Optional<Agenda> ag = ar.findById(id);
		
		if(!ag.isPresent()) {
			return "agendamento nao encontrado";
		}
		agenda.setIdAgenda(id);
		ar.save(agenda);
		return "agenda atualizada";
	}
	
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		ar.deleteById(id);
		return "evento apagado";
	}
	
	

}