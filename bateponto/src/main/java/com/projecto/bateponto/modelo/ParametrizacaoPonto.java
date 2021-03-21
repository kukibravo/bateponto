package com.projecto.bateponto.modelo;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParametrizacaoPonto {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Time horaEntrada;
	private Time horaSaida;
	private Integer qtdHorasDia;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Time getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(Time horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public Time getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(Time horaSaida) {
		this.horaSaida = horaSaida;
	}
	public Integer getQtdHorasDia() {
		return qtdHorasDia;
	}
	public void setQtdHorasDia(Integer qtdHorasDia) {
		this.qtdHorasDia = qtdHorasDia;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((horaEntrada == null) ? 0 : horaEntrada.hashCode());
		result = prime * result + ((horaSaida == null) ? 0 : horaSaida.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((qtdHorasDia == null) ? 0 : qtdHorasDia.hashCode());
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
		ParametrizacaoPonto other = (ParametrizacaoPonto) obj;
		if (horaEntrada == null) {
			if (other.horaEntrada != null)
				return false;
		} else if (!horaEntrada.equals(other.horaEntrada))
			return false;
		if (horaSaida == null) {
			if (other.horaSaida != null)
				return false;
		} else if (!horaSaida.equals(other.horaSaida))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (qtdHorasDia == null) {
			if (other.qtdHorasDia != null)
				return false;
		} else if (!qtdHorasDia.equals(other.qtdHorasDia))
			return false;
		return true;
	}
	
}
