package com.projetointegrador.wichstream.controller.form;

import com.projetointegrador.wichstream.model.Comentario;
import com.projetointegrador.wichstream.repository.ComentarioRepository;

public class AtualizacaoComentarioForm {

	private String titulo;
	private String descricao;
	
	
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
	
	public Comentario atualizar(Integer id, ComentarioRepository comentarioRepository) {
		Comentario comentario = comentarioRepository.getOne(id);
		
		comentario.setTitulo(this.titulo);
		comentario.setDescricao(this.descricao);
		
		return comentario;
	}
	
}
