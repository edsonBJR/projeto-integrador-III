package com.projetointegrador.wichstream.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.projetointegrador.wichstream.controller.dto.ComentarioDTO;
import com.projetointegrador.wichstream.controller.form.AtualizacaoComentarioForm;
import com.projetointegrador.wichstream.controller.form.ComentarioForm;
import com.projetointegrador.wichstream.model.Comentario;
import com.projetointegrador.wichstream.repository.ComentarioRepository;
import com.projetointegrador.wichstream.service.ComentarioService;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
	
	@Autowired
	private ComentarioService comentarioService;
	
	@Autowired
	private ComentarioRepository comentarioRepository;

	@PostMapping
	public ResponseEntity<ComentarioDTO> cadastar(@RequestBody @Valid ComentarioForm comentarioForm, UriComponentsBuilder uriBuilder) throws Exception {
		
		Comentario comentarioNovo = comentarioForm.converter(comentarioForm);
		
		comentarioService.cadastar(comentarioNovo);
		
		URI uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(comentarioNovo.getId()).toUri();
		return ResponseEntity.created(uri).body(new ComentarioDTO(comentarioNovo));
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<ComentarioDTO> atualizar(@PathVariable Integer id, @RequestBody @Valid AtualizacaoComentarioForm form) {
		Optional<Comentario> comentarioOptional = comentarioRepository.findById(id);
		if (comentarioOptional.isPresent()) {
			Comentario comentario = form.atualizar(id, comentarioRepository);
			return ResponseEntity.ok(new ComentarioDTO(comentario));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> remover(@PathVariable Integer id) {
		Optional<Comentario> comentarioOptional = comentarioRepository.findById(id);
		if (comentarioOptional.isPresent()) {
			comentarioRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	}
}
