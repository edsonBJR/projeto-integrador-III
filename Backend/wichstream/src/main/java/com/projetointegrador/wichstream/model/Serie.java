package com.projetointegrador.wichstream.model;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class Serie extends Conteudo {
	private static final long serialVersionUID = 1L;
	
	private String temporada;
	private String episodio;
	
	public Serie() {
	}

	public Serie(String temporada, String episodio) {
		super();
		this.temporada = temporada;
		this.episodio = episodio;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public String getEpisodio() {
		return episodio;
	}

	public void setEpisodio(String episodio) {
		this.episodio = episodio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(episodio);
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
		Serie other = (Serie) obj;
		return Objects.equals(episodio, other.episodio);
	}	

}
