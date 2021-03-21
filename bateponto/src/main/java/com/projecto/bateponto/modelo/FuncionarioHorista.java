package com.projecto.bateponto.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FuncionarioHorista extends Funcionario {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal salarioHora;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(BigDecimal salarioHora) {
		this.salarioHora = salarioHora;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((salarioHora == null) ? 0 : salarioHora.hashCode());
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
		FuncionarioHorista other = (FuncionarioHorista) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (salarioHora == null) {
			if (other.salarioHora != null)
				return false;
		} else if (!salarioHora.equals(other.salarioHora))
			return false;
		return true;
	}
	
}
