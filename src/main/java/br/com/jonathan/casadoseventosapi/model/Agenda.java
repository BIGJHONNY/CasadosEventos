package br.com.jonathan.casadoseventosapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgenda;
	
	@Column
	private Long idEvento;
	
	@Column(nullable = false)
	private Date dataEvento;
	
	@Column(nullable = false)
	private String horaEvento;
	
	@Column(nullable = false)
	private String tipoEvento;

	public Agenda() {
	}

	public Agenda(Long idAgenda, Long idEvento, Date dataEvento, String horaEvento, String tipoEvento) {
		this.idAgenda = idAgenda;
		this.idEvento = idEvento;
		this.dataEvento = dataEvento;
		this.horaEvento = horaEvento;
		this.tipoEvento = tipoEvento;
	}

	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getHoraEvento() {
		return horaEvento;
	}

	public void setHoraEvento(String horaEvento) {
		this.horaEvento = horaEvento;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	
	
	
	

}
