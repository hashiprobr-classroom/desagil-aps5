package br.edu.insper.desagil.aps5.chatogpt;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
	private String email;
	private Map<Integer, Chat> chats;

	public Usuario(String email, String nome) {
		this.email = email;
		this.chats = new HashMap<>();
	}

	public String getEmail() {
		return email;
	}

	public void salva(int chave, Chat chat) {
		chats.put(chave, chat);
	}

	public void apaga(int chave) {
		chats.remove(chave);
	}

	public int calculaTotalDeTotais() {
		int total = 0;
		for (Chat chat : chats.values()) {
			total += chat.calculaTotal();
		}
		return total;
	}
}
