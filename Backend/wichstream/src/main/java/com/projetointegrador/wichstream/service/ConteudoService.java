package com.projetointegrador.wichstream.service;

import java.time.LocalDateTime;
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

	public Conteudo buscarPorDescricao(String descricao) {
		return conteudoRepository.findByDescricao(descricao);
	}

	public Conteudo buscarPorDataLancamento(String dataLancamento) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(dataLancamento, formatter);
		return conteudoRepository.findByDataLancamento(dateTime);
	}

	public List<Conteudo> buscarPorGenero(String genero) {
		return conteudoRepository.findByGenero(genero);
	}
	
}
