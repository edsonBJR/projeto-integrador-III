package com.projetointegrador.wichstream.controller.form;

import java.time.LocalDate;

import com.projetointegrador.wichstream.model.Conteudo;

public class ConteudoForm {

	private String titulo;
	private String descricao;
	private String duracao;
	private LocalDate dataLancamento;
	private String genero;
	private String imagem;

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

	public Conteudo converter(ConteudoForm conteudoForm) {
		return new Conteudo(null, conteudoForm.getTitulo(), conteudoForm.getDescricao(), conteudoForm.getDuracao(),
				conteudoForm.getDataLancamento(), conteudoForm.getGenero(), conteudoForm.getGenero(), null);
	}
}
