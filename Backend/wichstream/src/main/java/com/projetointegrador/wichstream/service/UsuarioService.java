package com.projetointegrador.wichstream.service;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetointegrador.wichstream.model.Usuario;
import com.projetointegrador.wichstream.model.UsuarioRedeSocial;
import com.projetointegrador.wichstream.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario cadastar(Usuario usuario) throws Exception {
		
		if(buscarPorEmail(usuario.getEmail()) != null) {
			throw new Exception("Já existe usuário cadastrado com este email!");
		}
		
		return usuarioRepository.save(usuario);
		
	}

	public Usuario cadastarRedeSocial(UsuarioRedeSocial usuarioRedeSocial) {
		return null;
	}

	public Usuario atualizar(Usuario usuario, Integer id) {
		return null;
	}

	public void deletar(Integer id) {

	}
	
	public Usuario buscarPorEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}

}
