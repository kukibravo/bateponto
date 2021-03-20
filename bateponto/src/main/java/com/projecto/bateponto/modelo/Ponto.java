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
	private Time horaentrada;
	private Time horasaida;
	
	@OneToOne
	private Funcionario ponto_funcionario;
	@OneToOne
	private Parametrizacao_Ponto ponto_parametrizacaoponto;
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
	public Funcionario getPonto_funcionario() {
		return ponto_funcionario;
	}
	public void setPonto_funcionario(Funcionario ponto_funcionario) {
		this.ponto_funcionario = ponto_funcionario;
	}
	public Parametrizacao_Ponto getPonto_parametrizacaoponto() {
		return ponto_parametrizacaoponto;
	}
	public void setPonto_parametrizacaoponto(Parametrizacao_Ponto ponto_parametrizacaoponto) {
		this.ponto_parametrizacaoponto = ponto_parametrizacaoponto;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((horaentrada == null) ? 0 : horaentrada.hashCode());
		result = prime * result + ((horasaida == null) ? 0 : horasaida.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ponto_funcionario == null) ? 0 : ponto_funcionario.hashCode());
		result = prime * result + ((ponto_parametrizacaoponto == null) ? 0 : ponto_parametrizacaoponto.hashCode());
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
		if (ponto_funcionario == null) {
			if (other.ponto_funcionario != null)
				return false;
		} else if (!ponto_funcionario.equals(other.ponto_funcionario))
			return false;
		if (ponto_parametrizacaoponto == null) {
			if (other.ponto_parametrizacaoponto != null)
				return false;
		} else if (!ponto_parametrizacaoponto.equals(other.ponto_parametrizacaoponto))
			return false;
		return true;
	}
	
	
	
}
