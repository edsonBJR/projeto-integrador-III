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
	private String sequencia;
	private String temporada;
	private String episodio;

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

	public String getSequencia() {
		return sequencia;
	}

	public void setSequencia(String sequencia) {
		this.sequencia = sequencia;
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

	public Conteudo converter(ConteudoForm conteudoForm) {
		return new Conteudo(null, conteudoForm.getTitulo(), conteudoForm.getDescricao(), conteudoForm.getDuracao(),
				conteudoForm.getDataLancamento(), conteudoForm.getGenero(), conteudoForm.getGenero(), null,
				conteudoForm.getSequencia(), conteudoForm.getTemporada(), conteudoForm.getEpisodio());
	}
}
