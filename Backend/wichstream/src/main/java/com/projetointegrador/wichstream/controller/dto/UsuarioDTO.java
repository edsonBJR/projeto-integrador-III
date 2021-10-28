package com.projetointegrador.wichstream.controller.dto;

import com.projetointegrador.wichstream.model.Usuario;

public class UsuarioDTO {

	protected Integer id;
	protected String nome;
	protected String sobrenome;
	protected String email;
	protected String senha;
	
	public UsuarioDTO(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.sobrenome = usuario.getSobrenome();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

}
