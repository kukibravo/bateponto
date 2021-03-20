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
	private LocalDate dataprocessamento;
	
	@OneToOne
	private Funcionario_Contrato funcionariocontrato;

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

	public void setExercio(Integer exercicio) {
		this.exercicio = exercicio;
	}

	public LocalDate getDataprocessamento() {
		return dataprocessamento;
	}

	public void setDataprocessamento(LocalDate dataprocessamento) {
		this.dataprocessamento = dataprocessamento;
	}

	public Funcionario_Contrato getFuncionariocontrato() {
		return funcionariocontrato;
	}

	public void setFuncionariocontrato(Funcionario_Contrato funcionariocontrato) {
		this.funcionariocontrato = funcionariocontrato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataprocessamento == null) ? 0 : dataprocessamento.hashCode());
		result = prime * result + ((exercicio == null) ? 0 : exercicio.hashCode());
		result = prime * result + ((funcionariocontrato == null) ? 0 : funcionariocontrato.hashCode());
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
		if (dataprocessamento == null) {
			if (other.dataprocessamento != null)
				return false;
		} else if (!dataprocessamento.equals(other.dataprocessamento))
			return false;
		if (exercicio == null) {
			if (other.exercicio != null)
				return false;
		} else if (!exercicio.equals(other.exercicio))
			return false;
		if (funcionariocontrato == null) {
			if (other.funcionariocontrato != null)
				return false;
		} else if (!funcionariocontrato.equals(other.funcionariocontrato))
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
