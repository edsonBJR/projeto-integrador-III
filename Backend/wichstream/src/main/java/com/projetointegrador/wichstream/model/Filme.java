package com.projetointegrador.wichstream.model;

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
	
	
}
