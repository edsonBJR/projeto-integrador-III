package com.projetointegrador.wichstream.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.projetointegrador.wichstream.model.Conteudo;
import com.projetointegrador.wichstream.repository.ConteudoRepository;

@RunWith(MockitoJUnitRunner.class)
public class ConteudoServiceTest {

	@Mock
	private ConteudoRepository conteudoRepository;

	@InjectMocks
	private ConteudoService conteudoService;

	private Conteudo conteudo;

	private Conteudo conteudoA;
	private Conteudo conteudoB;

	private List<Conteudo> conteudos = new ArrayList<>();

	@Test
	public void testFindConteudoById() {

		Integer id = 2;

		conteudo = new Conteudo();
		conteudo.setId(id);
		conteudo.setTitulo("Rambo");
		conteudo.setDescricao("Filme de guerra baseado em fatos reais");
		conteudo.setDuracao("1 hora e 20 minutos");
		conteudo.setGenero("Acao");
		conteudo.setImagem("0a9sdv0as7bhvc07sabcv09a7shc09d7ch0adc09asddch");
		conteudo.setSequencia("2");

		Mockito.when(conteudoService.buscarPorId(id)).thenReturn(conteudo);

		Conteudo one = conteudoService.buscarPorId(id);

		Assert.assertEquals(conteudo, one);

	}

	@Test
	public void testFindConteudoPorTitulo() {

		Integer idA = 3;
		conteudoA = new Conteudo();
		conteudoA.setId(idA);
		conteudoA.setTitulo("Rambo");
		conteudoA.setDescricao("Filme de guerra baseado em fatos reais");
		conteudoA.setDuracao("1 hora e 20 minutos");
		conteudoA.setGenero("Acao");
		conteudoA.setImagem("0a9sdv0as7bhvc07sabcv09a7shc09d7ch0adc09asddch");
		conteudoA.setSequencia("2");

		Integer idB = 4;
		conteudoB = new Conteudo();
		conteudoB.setId(idB);
		conteudoB.setTitulo("Velozes e Furiosos");
		conteudoB.setDescricao("Filme de guerra baseado em fatos reais");
		conteudoB.setDuracao("1 hora e 20 minutos");
		conteudoB.setGenero("Acao");
		conteudoB.setImagem("0a9sdv0as7bhvc07sabcv09a7shc09d7ch0adc09asddch");
		conteudoB.setSequencia("2");

		conteudos.add(conteudoA);
		conteudos.add(conteudoB);

		Mockito.when(conteudoService.buscarPorTitulo("Rambo")).thenReturn(conteudoA);

		Conteudo buscarPorTitulo = conteudoService.buscarPorTitulo("Rambo");

		Assert.assertEquals(buscarPorTitulo, conteudoA);

	}

}
