package br.com.jonathan.casadoseventosapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEvento;
	
	@Column(length = 100,nullable = false)
	private String tipoEvento;
	
	@Column(length = 200,nullable = false)
	private String descricaoEvento;

	public Evento() {
	}

	public Evento(Long idEvento, String tipoEvento, String descricaoEvento) {
		this.idEvento = idEvento;
		this.tipoEvento = tipoEvento;
		this.descricaoEvento = descricaoEvento;
	}

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getDescricaoEvento() {
		return descricaoEvento;
	}

	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}
	
	

}
