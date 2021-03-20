package com.projecto.bateponto.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomecompleto;
	private LocalDate datanascimento;
	private String nacionalidade;
	@Enumerated(EnumType.STRING)
	private Sexo_Enum sexo = Sexo_Enum.MASCULINO;
	@Enumerated(EnumType.STRING)
	private TipoDocumento_Enum tipodocumento = TipoDocumento_Enum.BI;
	private String numerodocumento;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomecompleto() {
		return nomecompleto;
	}
	public void setNomecompleto(String nomecompleto) {
		this.nomecompleto = nomecompleto;
	}
	public LocalDate getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(LocalDate datanascimento) {
		this.datanascimento = datanascimento;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Sexo_Enum getSexo() {
		return sexo;
	}
	public void setSexo(Sexo_Enum sexo) {
		this.sexo = sexo;
	}
	public TipoDocumento_Enum getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(TipoDocumento_Enum tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public String getNumerodocumento() {
		return numerodocumento;
	}
	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datanascimento == null) ? 0 : datanascimento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nacionalidade == null) ? 0 : nacionalidade.hashCode());
		result = prime * result + ((nomecompleto == null) ? 0 : nomecompleto.hashCode());
		result = prime * result + ((numerodocumento == null) ? 0 : numerodocumento.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((tipodocumento == null) ? 0 : tipodocumento.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (datanascimento == null) {
			if (other.datanascimento != null)
				return false;
		} else if (!datanascimento.equals(other.datanascimento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nacionalidade == null) {
			if (other.nacionalidade != null)
				return false;
		} else if (!nacionalidade.equals(other.nacionalidade))
			return false;
		if (nomecompleto == null) {
			if (other.nomecompleto != null)
				return false;
		} else if (!nomecompleto.equals(other.nomecompleto))
			return false;
		if (numerodocumento == null) {
			if (other.numerodocumento != null)
				return false;
		} else if (!numerodocumento.equals(other.numerodocumento))
			return false;
		if (sexo != other.sexo)
			return false;
		if (tipodocumento != other.tipodocumento)
			return false;
		return true;
	}
	
	
}
