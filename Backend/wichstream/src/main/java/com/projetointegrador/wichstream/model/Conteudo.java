package com.projetointegrador.wichstream.model;

import java.time.LocalDate;

public class Conteudo {
	
	protected Integer id;
	protected String titulo;
	protected String descricao;
	protected String duracao;
	protected LocalDate dataLancamento;
	protected String genero;
	protected String imagem;
	protected Integer curtida;
	
	public Conteudo() {}
	
	public Conteudo(Integer id, String titulo, String descricao, String duracao, LocalDate dataLancamento,
			String genero, String imagem, Integer curtida) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.duracao = duracao;
		this.dataLancamento = dataLancamento;
		this.genero = genero;
		this.imagem = imagem;
		this.curtida = curtida;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public LocalDate getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	public Integer getCurtida() {
		return curtida;
	}
	public void setCurtida(Integer curtida) {
		this.curtida = curtida;
	}

}
