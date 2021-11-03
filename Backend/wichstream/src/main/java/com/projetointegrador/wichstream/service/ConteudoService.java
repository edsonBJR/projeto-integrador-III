package com.projetointegrador.wichstream.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetointegrador.wichstream.model.Conteudo;
import com.projetointegrador.wichstream.repository.ConteudoRepository;

@Service
public class ConteudoService {
	
	@Autowired
	private ConteudoRepository conteudoRepository;

	public Conteudo cadastrar(Conteudo conteudo) {
		return conteudoRepository.save(conteudo);
	}
	
	public Conteudo buscarPorTitulo(String titulo) {
		return conteudoRepository.findByTituloContainingIgnoreCase(titulo);
	}

	public Conteudo buscarPorDescricao(String descricao) {
		return conteudoRepository.findByDescricaoContainingIgnoreCase(descricao);
	}

	public Conteudo buscarPorDataLancamento(String dataLancamento) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(dataLancamento, formatter);
		return conteudoRepository.findByDataLancamento(date);
	}

	public List<Conteudo> buscarPorGenero(String genero) {
		return conteudoRepository.findByGeneroContainingIgnoreCase(genero);
	}
	
}
