package com.projetointegrador.wichstream.controller.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.projetointegrador.wichstream.model.Conteudo;
import com.projetointegrador.wichstream.repository.ConteudoRepository;

public class ConteudoDTO {

	private Integer id;
	private String titulo;
	private String descricao;
	private String duracao;
	private LocalDate dataLancamento;
	private String genero;
	private String imagem;
	private String sequencia;
	private String temporada;
	private String episodio;

	public ConteudoDTO() {
	}

	public ConteudoDTO(Conteudo conteudo) {
		this.id = conteudo.getId();
		this.titulo = conteudo.getTitulo();
		this.descricao = conteudo.getDescricao();
		this.duracao = conteudo.getDuracao();
		this.dataLancamento = conteudo.getDataLancamento();
		this.genero = conteudo.getGenero();
		this.imagem = conteudo.getImagem();
		this.sequencia = conteudo.getSequencia();
		this.temporada = conteudo.getTemporada();
		this.episodio = conteudo.getEpisodio();
	}

	public Integer getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDuracao() {
		return duracao;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public String getGenero() {
		return genero;
	}

	public String getImagem() {
		return imagem;
	}

	public String getSequencia() {
		return sequencia;
	}

	public String getTemporada() {
		return temporada;
	}

	public String getEpisodio() {
		return episodio;
	}

	public Conteudo atualizar(Integer id, ConteudoRepository conteudoRepository) {
		Conteudo conteudo = conteudoRepository.getOne(id);
		
		conteudo.setTitulo(titulo);
		conteudo.setDescricao(descricao);
		conteudo.setDuracao(duracao);
		conteudo.setDataLancamento(dataLancamento);
		conteudo.setGenero(genero);
		conteudo.setImagem(imagem);
		conteudo.setSequencia(sequencia);
		conteudo.setTemporada(temporada);
		conteudo.setEpisodio(episodio);
		
		return conteudo;
	}
	
	public static List<ConteudoDTO> converterLista(List<Conteudo> conteudos) {
		return conteudos.stream().map(ConteudoDTO::new).collect(Collectors.toList());
	}

}
