package br.edu.insper.desagil.aps5.chatogpt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	private Usuario u;

	@BeforeEach
	void setUp() {
		u = new Usuario("ze@pudim.com", "Zé Pudim");
	}

	@Test
	void calculaTotalDeTotais() {
		salvaChat(10, 1);
		salvaChat(11, 2);
		salvaChat(12, 3);
		assertEquals(6, u.calculaTotalDeTotais());
	}

	private void salvaChat(int chave, int valor) {
		Chat chat = mock(Chat.class);
		when(chat.calculaTotal()).thenReturn(valor);
		u.salva(chave, chat);
	}
}
