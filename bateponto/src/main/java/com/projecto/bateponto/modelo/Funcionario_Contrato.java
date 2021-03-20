package com.projecto.bateponto.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Funcionario_Contrato {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate datainicio;
	private LocalDate datafim;
	private Boolean activo;
	private String motivocancelamento;
	
	@OneToOne
	private Tipo_Contrato tipo_contrato;
	@ManyToOne
	private Funcionario funcionariocontrato_funcionario;
	
	public Funcionario getFuncionariocontrato_funcionario() {
		return funcionariocontrato_funcionario;
	}
	public void setFuncionariocontrato_funcionario(Funcionario funcionariocontrato_funcionario) {
		this.funcionariocontrato_funcionario = funcionariocontrato_funcionario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDataInicio() {
		return datainicio;
	}
	public void setDataInicio(LocalDate datainicio) {
		this.datainicio = datainicio;
	}
	public LocalDate getDataFim() {
		return datafim;
	}
	public void setDataFim(LocalDate datafim) {
		this.datafim = datafim;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	public String getMotivoCancelamento() {
		return motivocancelamento;
	}
	public void setMotivoCancelamento(String motivocancelamento) {
		this.motivocancelamento = motivocancelamento;
	}
	public Tipo_Contrato getTipoContrato() {
		return tipo_contrato;
	}
	public void setTipoContrato(Tipo_Contrato tipoContrato) {
		this.tipo_contrato = tipoContrato;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activo == null) ? 0 : activo.hashCode());
		result = prime * result + ((datafim == null) ? 0 : datafim.hashCode());
		result = prime * result + ((datainicio == null) ? 0 : datainicio.hashCode());
		result = prime * result
				+ ((funcionariocontrato_funcionario == null) ? 0 : funcionariocontrato_funcionario.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((motivocancelamento == null) ? 0 : motivocancelamento.hashCode());
		result = prime * result + ((tipo_contrato == null) ? 0 : tipo_contrato.hashCode());
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
		Funcionario_Contrato other = (Funcionario_Contrato) obj;
		if (activo == null) {
			if (other.activo != null)
				return false;
		} else if (!activo.equals(other.activo))
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
		if (funcionariocontrato_funcionario == null) {
			if (other.funcionariocontrato_funcionario != null)
				return false;
		} else if (!funcionariocontrato_funcionario.equals(other.funcionariocontrato_funcionario))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (motivocancelamento == null) {
			if (other.motivocancelamento != null)
				return false;
		} else if (!motivocancelamento.equals(other.motivocancelamento))
			return false;
		if (tipo_contrato == null) {
			if (other.tipo_contrato != null)
				return false;
		} else if (!tipo_contrato.equals(other.tipo_contrato))
			return false;
		return true;
	}
	
		
}
