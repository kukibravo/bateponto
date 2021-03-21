package com.projecto.bateponto.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FuncionarioMensalista extends Funcionario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Boolean isentoDePonto;
	private BigDecimal salarioMes;
	private BigDecimal bonosPorEntrega;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getIsentoDePonto() {
		return isentoDePonto;
	}
	public void setIsentoDePonto(Boolean isentoDePonto) {
		this.isentoDePonto = isentoDePonto;
	}
	public BigDecimal getSalarioMes() {
		return salarioMes;
	}
	public void setSalarioMes(BigDecimal salarioMes) {
		this.salarioMes = salarioMes;
	}
	public BigDecimal getBonosPorEntrega() {
		return bonosPorEntrega;
	}
	public void setBonosPorEntrega(BigDecimal bonosPorEntrega) {
		this.bonosPorEntrega = bonosPorEntrega;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bonosPorEntrega == null) ? 0 : bonosPorEntrega.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isentoDePonto == null) ? 0 : isentoDePonto.hashCode());
		result = prime * result + ((salarioMes == null) ? 0 : salarioMes.hashCode());
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
		FuncionarioMensalista other = (FuncionarioMensalista) obj;
		if (bonosPorEntrega == null) {
			if (other.bonosPorEntrega != null)
				return false;
		} else if (!bonosPorEntrega.equals(other.bonosPorEntrega))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isentoDePonto == null) {
			if (other.isentoDePonto != null)
				return false;
		} else if (!isentoDePonto.equals(other.isentoDePonto))
			return false;
		if (salarioMes == null) {
			if (other.salarioMes != null)
				return false;
		} else if (!salarioMes.equals(other.salarioMes))
			return false;
		return true;
	}
	
}
