package com.projetointegrador.wichstream.controller.form;

import java.time.LocalDate;

import com.projetointegrador.wichstream.model.Comentario;

public class ComentarioForm {
	
	private String titulo;
	private String descricao;
	private LocalDate dataCriacao;
	
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
	
	public Comentario converter(ComentarioForm comentarioForm) {
		return new Comentario(null, comentarioForm.getTitulo(), comentarioForm.getDescricao(), comentarioForm.getDataCriacao());
	}
	

}
