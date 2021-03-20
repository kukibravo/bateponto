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
	
	private String NOMECOMPLETO;
	private LocalDate DATANASCIMENTO;
	private String nacionalidade;
	@Enumerated(EnumType.STRING)
	private Sexo_Enum sexo = Sexo_Enum.MASCULINO;
	@Enumerated(EnumType.STRING)
	private TipoDocumento_Enum TIPODOCUMENTO = TipoDocumento_Enum.BI;
	private String NUMERODOCUMENTO;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeCompleto() {
		return NOMECOMPLETO;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.NOMECOMPLETO = nomeCompleto;
	}
	public LocalDate getDataNascimento() {
		return DATANASCIMENTO;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.DATANASCIMENTO = dataNascimento;
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
	public TipoDocumento_Enum getTipoDocumento() {
		return TIPODOCUMENTO;
	}
	public void setTipoDocumento(TipoDocumento_Enum tipoDocumento) {
		this.TIPODOCUMENTO = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return NUMERODOCUMENTO;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.NUMERODOCUMENTO = numeroDocumento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DATANASCIMENTO == null) ? 0 : DATANASCIMENTO.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nacionalidade == null) ? 0 : nacionalidade.hashCode());
		result = prime * result + ((NOMECOMPLETO == null) ? 0 : NOMECOMPLETO.hashCode());
		result = prime * result + ((NUMERODOCUMENTO == null) ? 0 : NUMERODOCUMENTO.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((TIPODOCUMENTO == null) ? 0 : TIPODOCUMENTO.hashCode());
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
		if (DATANASCIMENTO == null) {
			if (other.DATANASCIMENTO != null)
				return false;
		} else if (!DATANASCIMENTO.equals(other.DATANASCIMENTO))
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
		if (NOMECOMPLETO == null) {
			if (other.NOMECOMPLETO != null)
				return false;
		} else if (!NOMECOMPLETO.equals(other.NOMECOMPLETO))
			return false;
		if (NUMERODOCUMENTO == null) {
			if (other.NUMERODOCUMENTO != null)
				return false;
		} else if (!NUMERODOCUMENTO.equals(other.NUMERODOCUMENTO))
			return false;
		if (sexo != other.sexo)
			return false;
		if (TIPODOCUMENTO != other.TIPODOCUMENTO)
			return false;
		return true;
	}
	
}
