package com.projetointegrador.wichstream.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conteudo  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	
	protected String titulo;
	protected String descricao;
	protected String duracao;
	protected LocalDate dataLancamento;
	protected String genero;
	protected String imagem;
	protected Integer curtida;
	protected String sequencia;
	protected String temporada;
	protected String episodio;
	
	public Conteudo() {}
	
	public Conteudo(Integer id, String titulo, String descricao, String duracao, LocalDate dataLancamento,
			String genero, String imagem, Integer curtida, String sequencia, String temporada, String episodio) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.duracao = duracao;
		this.dataLancamento = dataLancamento;
		this.genero = genero;
		this.imagem = imagem;
		this.curtida = curtida;
		this.sequencia = sequencia;
		this.temporada = temporada;
		this.episodio = episodio;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conteudo other = (Conteudo) obj;
		return Objects.equals(id, other.id);
	}

}
