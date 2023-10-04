package br.edu.insper.desagil.aps5.chatogpt;

import java.util.List;

public class ChatPremium extends Chat {
	public ChatPremium(List<Interacao> interacoes) {
		super(interacoes);
	}

	@Override
	public int calculaTotal() {
		int total = 0;
		for (Interacao interacao : getInteracoes()) {
			total += interacao.calcula();
		}
		return total;
	}
}
