package com.projetointegrador.wichstream.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetointegrador.wichstream.model.Conteudo;

public interface ConteudoRepository extends JpaRepository<Conteudo, Integer> {
	
	Conteudo findByDescricao(String descricao);
	Conteudo findByDataLancamento(LocalDateTime dataLancamento);
	List<Conteudo> findByGenero(String genero);

}
