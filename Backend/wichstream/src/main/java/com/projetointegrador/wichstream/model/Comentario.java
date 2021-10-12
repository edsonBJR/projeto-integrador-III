package com.projetointegrador.wichstream.model;

import java.time.LocalDate;

public class Comentario {
	
	protected Integer id;
	protected String titulo;
	protected String descricao;
	protected LocalDate dataCriacao;
	
	public Comentario() {}
	
	public Comentario(Integer id, String titulo, String descricao, LocalDate dataCriacao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
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
	
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
}
