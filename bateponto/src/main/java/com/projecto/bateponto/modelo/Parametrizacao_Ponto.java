package com.projecto.bateponto.modelo;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parametrizacao_Ponto {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Time horaentrada;
	private Time horasaida;
	private Integer qtdhorasdia;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Time getHoraentrada() {
		return horaentrada;
	}
	public void setHoraentrada(Time horaentrada) {
		this.horaentrada = horaentrada;
	}
	public Time getHorasaida() {
		return horasaida;
	}
	public void setHorasaida(Time horasaida) {
		this.horasaida = horasaida;
	}
	public Integer getQtdhorasdia() {
		return qtdhorasdia;
	}
	public void setQtdhorasdia(Integer qtdhorasdia) {
		this.qtdhorasdia = qtdhorasdia;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((horaentrada == null) ? 0 : horaentrada.hashCode());
		result = prime * result + ((horasaida == null) ? 0 : horasaida.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((qtdhorasdia == null) ? 0 : qtdhorasdia.hashCode());
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
		Parametrizacao_Ponto other = (Parametrizacao_Ponto) obj;
		if (horaentrada == null) {
			if (other.horaentrada != null)
				return false;
		} else if (!horaentrada.equals(other.horaentrada))
			return false;
		if (horasaida == null) {
			if (other.horasaida != null)
				return false;
		} else if (!horasaida.equals(other.horasaida))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (qtdhorasdia == null) {
			if (other.qtdhorasdia != null)
				return false;
		} else if (!qtdhorasdia.equals(other.qtdhorasdia))
			return false;
		return true;
	}
	
	
	
}
