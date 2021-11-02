package com.projetointegrador.wichstream.controller.dto;

import java.time.LocalDate;

import com.projetointegrador.wichstream.model.Comentario;
import com.projetointegrador.wichstream.repository.ComentarioRepository;

public class ComentarioDTO {

	private Integer id;
	private String titulo;
	private String descricao;
	private LocalDate dataCriacao;

	public ComentarioDTO() {
	}

	public ComentarioDTO(Comentario comentario) {
		this.id = comentario.getId();
		this.titulo = comentario.getTitulo();
		this.descricao = comentario.getDescricao();
		this.dataCriacao = comentario.getDataCriacao();
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

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	
	public Comentario atualizar(Integer id, ComentarioRepository comentarioRepository) {
		Comentario comentario = comentarioRepository.getOne(id);
		
		comentario.setTitulo(titulo);
		comentario.setDescricao(descricao);
		comentario.setDataCriacao(dataCriacao);
		
		return comentario;
	}

}