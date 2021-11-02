package com.projetointegrador.wichstream.controller.form;

import com.projetointegrador.wichstream.model.Usuario;
import com.projetointegrador.wichstream.repository.UsuarioRepository;

public class AtualizacaoUsuarioForm {
	
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	private String idUsuarioRs;
	private String autenticacaoTipo;
	private String usuarioFotoRs;
	private String usuarioNomeRs;
	
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
	public String getIdUsuarioRs() {
		return idUsuarioRs;
	}
	public void setIdUsuarioRs(String idUsuarioRs) {
		this.idUsuarioRs = idUsuarioRs;
	}
	public String getAutenticacaoTipo() {
		return autenticacaoTipo;
	}
	public void setAutenticacaoTipo(String autenticacaoTipo) {
		this.autenticacaoTipo = autenticacaoTipo;
	}
	public String getUsuarioFotoRs() {
		return usuarioFotoRs;
	}
	public void setUsuarioFotoRs(String usuarioFotoRs) {
		this.usuarioFotoRs = usuarioFotoRs;
	}
	public String getUsuarioNomeRs() {
		return usuarioNomeRs;
	}
	public void setUsuarioNomeRs(String usuarioNomeRs) {
		this.usuarioNomeRs = usuarioNomeRs;
	}
	
	public Usuario atualizar(Integer id, UsuarioRepository usuarioRepository) {
		Usuario usuario = usuarioRepository.getOne(id);
		
		usuario.setNome(this.nome);
		usuario.setSobrenome(this.sobrenome);
		usuario.setEmail(this.email);
		usuario.setSenha(this.senha);
		
		return usuario;
	}
	
}
