package br.edu.insper.desagil.aps5.chatogpt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InteracaoTest {
	private Interacao i;

	@BeforeEach
	void setUp() {
		i = new Interacao();
	}

	@Test
	void respondeSemPergunta() {
		Exception exception = assertThrows(IllegalStateException.class, () -> {
			i.responde("Uma resposta!");
		});
		assertEquals("Nenhuma pergunta foi feita.", exception.getMessage());
	}

	@Test
	void respondeComPergunta() {
		i.setPergunta("Alguma pergunta?");
		i.responde("Uma resposta!");
		assertEquals("Uma resposta!", i.getResposta());
	}

	@Test
	void calculaSemPergunta() {
		assertEquals(0, i.calcula());
	}

	@Test
	void calculaSemResposta() {
		i.setPergunta("Alguma pergunta?");
		assertEquals(0, i.calcula());
	}

	@Test
	void calcula() {
		i.setPergunta("Alguma pergunta?");
		i.responde("Uma resposta!");
		assertEquals(29, i.calcula());
	}
}
