package com.projetointegrador.wichstream.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.projetointegrador.wichstream.controller.dto.UsuarioDTO;
import com.projetointegrador.wichstream.controller.form.UsuarioForm;
import com.projetointegrador.wichstream.model.Usuario;
import com.projetointegrador.wichstream.service.UsuarioService;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@PostMapping
	public ResponseEntity<UsuarioDTO> cadastar(@RequestBody @Valid UsuarioForm usuarioForm, UriComponentsBuilder uriBuilder) throws Exception {
		
		Usuario usuarioNovo = usuarioForm.converter(usuarioForm);
		
		usuarioService.cadastar(usuarioNovo);
		
		URI uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuarioNovo.getId()).toUri();
		return ResponseEntity.created(uri).body(new UsuarioDTO(usuarioNovo));
	}

//	@PutMapping("/{id}")
//	public ResponseEntity<UsuarioDTO> atualizar(@PathVariable Integer id, @RequestBody @Valid AtualizacaoUsuarioForm ) {
//		
//	}
}
