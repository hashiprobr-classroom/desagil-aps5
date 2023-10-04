package br.edu.insper.desagil.aps5.chatogpt;

import java.util.List;

public abstract class Chat {
	private List<Interacao> interacoes;

	public Chat(List<Interacao> interacoes) {
		this.interacoes = interacoes;
	}

	public List<Interacao> getInteracoes() {
		return interacoes;
	}

	public abstract int calculaTotal();
}
