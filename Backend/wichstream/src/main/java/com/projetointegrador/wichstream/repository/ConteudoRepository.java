package com.projetointegrador.wichstream.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetointegrador.wichstream.model.Conteudo;

public interface ConteudoRepository extends JpaRepository<Conteudo, Integer> {
	
	Conteudo findByTituloContainingIgnoreCase(String titulo);
	Conteudo findByDescricaoContainingIgnoreCase(String descricao);
	Conteudo findByDataLancamento(LocalDate dataLancamento);
	List<Conteudo> findByGeneroContainingIgnoreCase(String genero);
	List<Conteudo> findByTemporada(String numeroSerieTemporada);
	List<Conteudo> findByEpisodio(String numeroSerieEpisodio);
	List<Conteudo> findBySequencia(String numeroFilmeSequencia);

}
