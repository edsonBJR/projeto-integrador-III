package com.projetointegrador.wichstream.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@GetMapping
	public String helloWorld() {
		return "Olá Mundo!";
	}
	
//	@GetMapping("/{id}")
//	public ResponseEntity<Usuario> findById(@PathVariable Integer id) {
//		
//		return ResponseEntity.ok(usuario);
//	}

}
