package br.edu.insper.desagil.aps5.chatogpt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChatPremiumTest {
	private List<Interacao> interacoes;
	private ChatPremium c;

	@BeforeEach
	void setUp() {
		interacoes = new ArrayList<>();
		c = new ChatPremium(interacoes);
	}

	@Test
	void calculaTotalComZero() {
		assertEquals(0, c.calculaTotal());
	}

	@Test
	void calculaTotalComUm() {
		adicionaInteracao(1);
		assertEquals(1, c.calculaTotal());
	}

	@Test
	void calculaTotalComDois() {
		adicionaInteracao(1);
		adicionaInteracao(2);
		assertEquals(3, c.calculaTotal());
	}

	@Test
	void calculaTotalComTres() {
		adicionaInteracao(1);
		adicionaInteracao(2);
		adicionaInteracao(3);
		assertEquals(6, c.calculaTotal());
	}

	private void adicionaInteracao(int valor) {
		Interacao interacao = mock(Interacao.class);
		when(interacao.calcula()).thenReturn(valor);
		interacoes.add(interacao);
	}
}
