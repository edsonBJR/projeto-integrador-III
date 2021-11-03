package com.projetointegrador.wichstream.model;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class Filme extends Conteudo {
	private static final long serialVersionUID = 1L;

	private String sequencia;
	
	public Filme() {
	}

	public Filme(String sequencia) {
		super();
		this.sequencia = sequencia;
	}

	public String getSequencia() {
		return sequencia;
	}

	public void setSequencia(String sequencia) {
		this.sequencia = sequencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(sequencia);
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
		Filme other = (Filme) obj;
		return Objects.equals(sequencia, other.sequencia);
	}
	
}
