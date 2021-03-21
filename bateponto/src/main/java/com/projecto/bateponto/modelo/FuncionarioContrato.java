package com.projecto.bateponto.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class FuncionarioContrato extends Funcionario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate datainicio;
	private LocalDate datafim;
	private Boolean activo;
	private String motivoCancelamento;
	
	@OneToOne
	private TipoContrato tipoContrato;
	@ManyToOne
	private Funcionario contratoFuncionario;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(LocalDate datainicio) {
		this.datainicio = datainicio;
	}
	public LocalDate getDatafim() {
		return datafim;
	}
	public void setDatafim(LocalDate datafim) {
		this.datafim = datafim;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	public String getMotivoCancelamento() {
		return motivoCancelamento;
	}
	public void setMotivoCancelamento(String motivoCancelamento) {
		this.motivoCancelamento = motivoCancelamento;
	}
	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public Funcionario getContratoFuncionario() {
		return contratoFuncionario;
	}
	public void setContratoFuncionario(Funcionario contratoFuncionario) {
		this.contratoFuncionario = contratoFuncionario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activo == null) ? 0 : activo.hashCode());
		result = prime * result + ((contratoFuncionario == null) ? 0 : contratoFuncionario.hashCode());
		result = prime * result + ((datafim == null) ? 0 : datafim.hashCode());
		result = prime * result + ((datainicio == null) ? 0 : datainicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((motivoCancelamento == null) ? 0 : motivoCancelamento.hashCode());
		result = prime * result + ((tipoContrato == null) ? 0 : tipoContrato.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FuncionarioContrato other = (FuncionarioContrato) obj;
		if (activo == null) {
			if (other.activo != null)
				return false;
		} else if (!activo.equals(other.activo))
			return false;
		if (contratoFuncionario == null) {
			if (other.contratoFuncionario != null)
				return false;
		} else if (!contratoFuncionario.equals(other.contratoFuncionario))
			return false;
		if (datafim == null) {
			if (other.datafim != null)
				return false;
		} else if (!datafim.equals(other.datafim))
			return false;
		if (datainicio == null) {
			if (other.datainicio != null)
				return false;
		} else if (!datainicio.equals(other.datainicio))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (motivoCancelamento == null) {
			if (other.motivoCancelamento != null)
				return false;
		} else if (!motivoCancelamento.equals(other.motivoCancelamento))
			return false;
		if (tipoContrato == null) {
			if (other.tipoContrato != null)
				return false;
		} else if (!tipoContrato.equals(other.tipoContrato))
			return false;
		return true;
	}
	
}
