package com.projetointegrador.wichstream.service;

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
	
	public void deletar(Integer id) {
		
	}
	
	public Conteudo buscarPorId(Integer id) {
		return null;
	}
	
	public Conteudo buscarPorTitulo(String titulo) {
		return null;
	}
	
	public Conteudo buscarPorDescricao(String descricao) {
		return null;
	}
	
	public List<Conteudo> buscarPorDataLancamento(String dataLancamento) {
		return null;
	}
	
	public List<Conteudo> buscarPorGenero(String genero) {
		return null;
	}
	
	public void curtir(Integer id) {
	}
	
	public void compartilhar(Integer id) {
	}
	
	
}
