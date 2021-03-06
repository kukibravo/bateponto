package com.projecto.bateponto.modelo;

import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ponto {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate data;
	private Time horaEntrada;
	private Time horaSaida;
	
	@OneToOne
	private Funcionario pontoFuncionario;
	@OneToOne
	private ParametrizacaoPonto pontoParametrizacaoPonto;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
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
	public Funcionario getPontoFuncionario() {
		return pontoFuncionario;
	}
	public void setPontoFuncionario(Funcionario pontoFuncionario) {
		this.pontoFuncionario = pontoFuncionario;
	}
	public ParametrizacaoPonto getPontoParametrizacaoPonto() {
		return pontoParametrizacaoPonto;
	}
	public void setPontoParametrizacaoPonto(ParametrizacaoPonto pontoParametrizacaoPonto) {
		this.pontoParametrizacaoPonto = pontoParametrizacaoPonto;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((horaEntrada == null) ? 0 : horaEntrada.hashCode());
		result = prime * result + ((horaSaida == null) ? 0 : horaSaida.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pontoFuncionario == null) ? 0 : pontoFuncionario.hashCode());
		result = prime * result + ((pontoParametrizacaoPonto == null) ? 0 : pontoParametrizacaoPonto.hashCode());
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
		Ponto other = (Ponto) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
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
		if (pontoFuncionario == null) {
			if (other.pontoFuncionario != null)
				return false;
		} else if (!pontoFuncionario.equals(other.pontoFuncionario))
			return false;
		if (pontoParametrizacaoPonto == null) {
			if (other.pontoParametrizacaoPonto != null)
				return false;
		} else if (!pontoParametrizacaoPonto.equals(other.pontoParametrizacaoPonto))
			return false;
		return true;
	}
	
}
