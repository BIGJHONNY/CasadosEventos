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

import br.com.jonathan.casadoseventosapi.Repository.EventoRepository;
import br.com.jonathan.casadoseventosapi.model.Evento;


@RestController
@RequestMapping("/evento")
public class EventoController {
	
	@Autowired
	private EventoRepository er;
	
	@GetMapping("/listar")
	public List<Evento> listar(){
		return er.findAll();
	}
	
	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Evento evento) {
		er.save(evento);
		return "Evento Cadastrado com sucesso";
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@RequestBody Evento evento, @PathVariable Long id) {
		Optional<Evento> ev = er.findById(id);
		
		if(!ev.isPresent()) {
			return "o evento nao foi atualizado";
		}
		
		evento.setIdEvento(id);
		er.save(evento);
		return "Evento atualizado com sucesso";	
	}
	
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		er.deleteById(id);
		return "evento apagado";
		
		
	}
}
