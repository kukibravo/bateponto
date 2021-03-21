package com.projecto.bateponto.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ProcessamentoSalario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer mes;
	private Integer exercicio;
	private LocalDate dataProcessamento;
	
	@OneToOne
	private FuncionarioContrato funcionarioContrato;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getExercicio() {
		return exercicio;
	}

	public void setExercicio(Integer exercicio) {
		this.exercicio = exercicio;
	}

	public LocalDate getDataProcessamento() {
		return dataProcessamento;
	}

	public void setDataProcessamento(LocalDate dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}

	public FuncionarioContrato getFuncionarioContrato() {
		return funcionarioContrato;
	}

	public void setFuncionarioContrato(FuncionarioContrato funcionarioContrato) {
		this.funcionarioContrato = funcionarioContrato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataProcessamento == null) ? 0 : dataProcessamento.hashCode());
		result = prime * result + ((exercicio == null) ? 0 : exercicio.hashCode());
		result = prime * result + ((funcionarioContrato == null) ? 0 : funcionarioContrato.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mes == null) ? 0 : mes.hashCode());
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
		ProcessamentoSalario other = (ProcessamentoSalario) obj;
		if (dataProcessamento == null) {
			if (other.dataProcessamento != null)
				return false;
		} else if (!dataProcessamento.equals(other.dataProcessamento))
			return false;
		if (exercicio == null) {
			if (other.exercicio != null)
				return false;
		} else if (!exercicio.equals(other.exercicio))
			return false;
		if (funcionarioContrato == null) {
			if (other.funcionarioContrato != null)
				return false;
		} else if (!funcionarioContrato.equals(other.funcionarioContrato))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mes == null) {
			if (other.mes != null)
				return false;
		} else if (!mes.equals(other.mes))
			return false;
		return true;
	}

}
