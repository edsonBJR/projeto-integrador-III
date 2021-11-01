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

import com.projetointegrador.wichstream.controller.dto.UsuarioDTO;
import com.projetointegrador.wichstream.controller.form.AtualizacaoUsuarioForm;
import com.projetointegrador.wichstream.controller.form.UsuarioForm;
import com.projetointegrador.wichstream.model.Usuario;
import com.projetointegrador.wichstream.repository.UsuarioRepository;
import com.projetointegrador.wichstream.service.UsuarioService;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@PostMapping
	public ResponseEntity<UsuarioDTO> cadastar(@RequestBody @Valid UsuarioForm usuarioForm, UriComponentsBuilder uriBuilder) throws Exception {
		
		Usuario usuarioNovo = usuarioForm.converter(usuarioForm);
		
		usuarioService.cadastar(usuarioNovo);
		
		URI uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuarioNovo.getId()).toUri();
		return ResponseEntity.created(uri).body(new UsuarioDTO(usuarioNovo));
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<UsuarioDTO> atualizar(@PathVariable Integer id, @RequestBody @Valid AtualizacaoUsuarioForm form) {
		Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
		if (usuarioOptional.isPresent()) {
			Usuario usuario = form.atualizar(id, usuarioRepository);
			return ResponseEntity.ok(new UsuarioDTO(usuario));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> remover(@PathVariable Integer id) {
		Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
		if (usuarioOptional.isPresent()) {
			usuarioRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	}
}
