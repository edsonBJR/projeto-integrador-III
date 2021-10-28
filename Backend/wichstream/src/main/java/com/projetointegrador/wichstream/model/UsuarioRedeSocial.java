package com.projetointegrador.wichstream.model;

import java.util.Objects;

public class UsuarioRedeSocial extends Usuario {
	private static final long serialVersionUID = 1L;

	private String autenticacaoTipo;
	private String idUsuarioRs;
	private String usuarioFotoRs;
	private String usuarioNomeRs;
	
	public UsuarioRedeSocial() {
	}

	public UsuarioRedeSocial(String autenticacaoTipo, String idUsuarioRs, String usuarioFotoRs, String usuarioNomeRs) {
		this.autenticacaoTipo = autenticacaoTipo;
		this.idUsuarioRs = idUsuarioRs;
		this.usuarioFotoRs = usuarioFotoRs;
		this.usuarioNomeRs = usuarioNomeRs;
	}

	public String getAutenticacaoTipo() {
		return autenticacaoTipo;
	}

	public void setAutenticacaoTipo(String autenticacaoTipo) {
		this.autenticacaoTipo = autenticacaoTipo;
	}

	public String getIdUsuarioRs() {
		return idUsuarioRs;
	}

	public void setIdUsuarioRs(String idUsuarioRs) {
		this.idUsuarioRs = idUsuarioRs;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(idUsuarioRs);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioRedeSocial other = (UsuarioRedeSocial) obj;
		return Objects.equals(idUsuarioRs, other.idUsuarioRs);
	}

}
