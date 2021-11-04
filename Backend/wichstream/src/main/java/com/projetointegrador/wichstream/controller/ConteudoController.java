package com.projetointegrador.wichstream.controller;

import java.net.URI;
import java.util.List;
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

	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<ConteudoDTO> buscarConteudoPorTitulo(@PathVariable String titulo) {
		Conteudo conteudoPorDescricao = conteudoService.buscarPorTitulo(titulo);
		if(conteudoPorDescricao != null) {
			return ResponseEntity.ok(new ConteudoDTO(conteudoPorDescricao)); 
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<ConteudoDTO> buscarConteudoPorDescricao(@PathVariable String descricao) {
		Conteudo conteudoPorDescricao = conteudoService.buscarPorDescricao(descricao);
		if(conteudoPorDescricao != null) {
			return ResponseEntity.ok(new ConteudoDTO(conteudoPorDescricao)); 
		}
		return ResponseEntity.notFound().build();
	}

	@GetMapping("/dataLancamento/{dataLancamento}")
	public ResponseEntity<ConteudoDTO> buscarConteudoPorDataLancamento(@PathVariable String dataLancamento) {
		Conteudo conteudoPorDataLancamento = conteudoService.buscarPorDataLancamento(dataLancamento);
		if(conteudoPorDataLancamento != null) {
			return ResponseEntity.ok(new ConteudoDTO(conteudoPorDataLancamento)); 
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/genero/{genero}")
	public List<ConteudoDTO> buscarConteudoPorGenero(@PathVariable String genero) {
		List<Conteudo> conteudosPorGenero = conteudoService.buscarPorGenero(genero);
		if (conteudosPorGenero == null) {
			List<Conteudo> todosConteudos = conteudoRepository.findAll();
			return ConteudoDTO.converterLista(todosConteudos);
		} else {
			List<Conteudo> todosConteudos= conteudoRepository.findByGeneroContainingIgnoreCase(genero);
			return ConteudoDTO.converterLista(todosConteudos);
		}
	}
	
	@GetMapping("/serieTemporada/{numero}")
	public List<ConteudoDTO>  buscarConteudoSeriePorTemporada(@PathVariable String numero) {
		List<Conteudo> conteudoPorNumeroSerieTemporada = conteudoService.buscarPorSerieTemporada(numero);
		return ConteudoDTO.converterLista(conteudoPorNumeroSerieTemporada);
	}
	
	@GetMapping("/serieEpisodio/{numero}")
	public List<ConteudoDTO>  buscarConteudoSeriePorEpisodio(@PathVariable String numero) {
		List<Conteudo> conteudoPorNumeroSerieEpisodio = conteudoService.buscarPorSerieEpisodio(numero);
		return ConteudoDTO.converterLista(conteudoPorNumeroSerieEpisodio);
	}
	
	@GetMapping("/filmeSequencia/{numero}")
	public List<ConteudoDTO>  buscarConteudoFilmePorSequencia(@PathVariable String numero) {
		List<Conteudo> conteudoPorNumeroFilmeSequencia = conteudoService.buscarPorFilmeSequencia(numero);
		return ConteudoDTO.converterLista(conteudoPorNumeroFilmeSequencia);
	}
}
