package com.projetointegrador.wichstream.controller.form;

import javax.validation.constraints.NotNull;

import com.projetointegrador.wichstream.model.Usuario;

public class UsuarioForm {
	
	@NotNull
	protected String nome;
	
	@NotNull
	protected String sobrenome;
	
	@NotNull
	protected String email;
	
	@NotNull
	protected String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Usuario converter(UsuarioForm usuarioForm) {
		return new Usuario(null, usuarioForm.getNome(), usuarioForm.getSobrenome(), usuarioForm.getEmail(), usuarioForm.getSenha());
	}
	
}
