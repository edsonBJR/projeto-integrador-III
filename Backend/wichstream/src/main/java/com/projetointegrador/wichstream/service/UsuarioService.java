package com.projetointegrador.wichstream.service;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetointegrador.wichstream.model.Usuario;
import com.projetointegrador.wichstream.repository.UsuarioRedeSocialRepository;
import com.projetointegrador.wichstream.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioRedeSocialRepository usuarioRedeSocialRepository;

	public Usuario cadastar(Usuario usuario) throws Exception {
		
		if(buscarPorEmail(usuario.getEmail()) != null) {
			throw new Exception("Já existe usuário cadastrado com este email!");
		}
		
		return usuarioRepository.save(usuario);
		
	}

	public void deletar(Integer id) {
		if (buscarPorId(id) != null) {
			usuarioRepository.deleteById(id);
		}
	}
	
	public Usuario buscarPorId(Integer id) {
		Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
		return usuarioOptional.orElseThrow(() -> new ObjectNotFoundException(id, "Usuário não encontrado!"));
	}

	public Usuario buscarPorEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}
	
	public Usuario buscarPorIdUsuarioRs(String idUsuarioRs) {
		return usuarioRedeSocialRepository.findByIdUsuarioRs(idUsuarioRs);
	}

}
