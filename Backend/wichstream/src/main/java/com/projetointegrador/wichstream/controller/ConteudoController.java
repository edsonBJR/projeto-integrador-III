package com.projetointegrador.wichstream.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.projetointegrador.wichstream.controller.dto.ConteudoDTO;
import com.projetointegrador.wichstream.controller.form.AtualizacaoConteudoForm;
import com.projetointegrador.wichstream.controller.form.ConteudoForm;
import com.projetointegrador.wichstream.model.Conteudo;
import com.projetointegrador.wichstream.repository.ConteudoRepository;
import com.projetointegrador.wichstream.service.ConteudoService;

@RestController
@RequestMapping("/conteudos")
public class ConteudoController {
	
	@Autowired
	private ConteudoService conteudoService;
	
	@Autowired 
	private ConteudoRepository conteudoRepository;
	
	@PostMapping
	public ResponseEntity<ConteudoDTO> cadastar(@RequestBody @Valid ConteudoForm conteudoForm, UriComponentsBuilder uriBuilder) throws Exception {
		
		Conteudo conteudoNovo = conteudoForm.converter(conteudoForm);
		
		conteudoService.cadastrar(conteudoNovo);
		
		URI uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(conteudoNovo.getId()).toUri();
		return ResponseEntity.created(uri).body(new ConteudoDTO(conteudoNovo));
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<ConteudoDTO> atualizar(@PathVariable Integer id, @RequestBody @Valid AtualizacaoConteudoForm form) {
		Optional<Conteudo> conteudoOptional = conteudoRepository.findById(id);
		if (conteudoOptional.isPresent()) {
			Conteudo conteudo = form.atualizar(id, conteudoRepository);
			return ResponseEntity.ok(new ConteudoDTO(conteudo));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> remover(@PathVariable Integer id) {
		Optional<Conteudo> conteudoOptional = conteudoRepository.findById(id);
		if (conteudoOptional.isPresent()) {
			conteudoRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	}

	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<ConteudoDTO> buscarConteudoPorDescricao() {
		return null;
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<ConteudoDTO> buscarConteudoPorTitulo() {
		return null;
	}
	
	@GetMapping("/dataLancamento/{dataLancamento}")
	
	public ResponseEntity<ConteudoDTO> buscarConteudoPorDataLancamento() {
		return null;
	}
	
	@GetMapping("/genero/{genero}")
	public ResponseEntity<ConteudoDTO> buscarConteudoPorGenero() {
		return null;
	}
	
	@GetMapping("/serieTemporada/{numero}")
	public ResponseEntity<ConteudoDTO> buscarConteudoSeriePorTemporada() {
		return null;
	}
	
	@GetMapping("/serieEpisodio/{numero}")
	public ResponseEntity<ConteudoDTO> buscarConteudoSeriePorEpisodio() {
		return null;
	}
	
	@GetMapping("/filmeSequencia/{numero}")
	public ResponseEntity<ConteudoDTO> buscarConteudoFilmePorSequencia() {
		return null;
	}
}
