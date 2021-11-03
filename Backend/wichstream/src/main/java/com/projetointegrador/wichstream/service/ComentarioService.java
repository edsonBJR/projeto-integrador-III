package com.projetointegrador.wichstream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetointegrador.wichstream.model.Comentario;
import com.projetointegrador.wichstream.repository.ComentarioRepository;

@Service
public class ComentarioService {
	
	@Autowired
	private ComentarioRepository comentarioRepository;

	public Comentario cadastar(Comentario comentario) {

		return comentarioRepository.save(comentario);
	}

	public void comentar(Integer id) {

	}

}
