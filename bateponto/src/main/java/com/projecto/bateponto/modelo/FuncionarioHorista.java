package com.projecto.bateponto.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("FuncionarioHorista")
public class FuncionarioHorista extends Funcionario {
	
	private BigDecimal salarioHora;

	public BigDecimal getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(BigDecimal salarioHora) {
		this.salarioHora = salarioHora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((salarioHora == null) ? 0 : salarioHora.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FuncionarioHorista other = (FuncionarioHorista) obj;
		if (salarioHora == null) {
			if (other.salarioHora != null)
				return false;
		} else if (!salarioHora.equals(other.salarioHora))
			return false;
		return true;
	}
	
}
