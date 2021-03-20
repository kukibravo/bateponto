package com.projecto.bateponto.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario_Mensalista {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Boolean isentodeponto;
	private BigDecimal salariomes;
	private BigDecimal bonosporentrega;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getIsentodoponto() {
		return isentodeponto;
	}
	public void setIsentodoponto(Boolean isentodeponto) {
		this.isentodeponto = isentodeponto;
	}
	public BigDecimal getSalariomes() {
		return salariomes;
	}
	public void setSalariomes(BigDecimal salariomes) {
		this.salariomes = salariomes;
	}
	public BigDecimal getBonosporentrega() {
		return bonosporentrega;
	}
	public void setBonosporentrega(BigDecimal bonosporentrega) {
		this.bonosporentrega = bonosporentrega;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bonosporentrega == null) ? 0 : bonosporentrega.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isentodeponto == null) ? 0 : isentodeponto.hashCode());
		result = prime * result + ((salariomes == null) ? 0 : salariomes.hashCode());
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
		Funcionario_Mensalista other = (Funcionario_Mensalista) obj;
		if (bonosporentrega == null) {
			if (other.bonosporentrega != null)
				return false;
		} else if (!bonosporentrega.equals(other.bonosporentrega))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isentodeponto == null) {
			if (other.isentodeponto != null)
				return false;
		} else if (!isentodeponto.equals(other.isentodeponto))
			return false;
		if (salariomes == null) {
			if (other.salariomes != null)
				return false;
		} else if (!salariomes.equals(other.salariomes))
			return false;
		return true;
	}
	
	
}
