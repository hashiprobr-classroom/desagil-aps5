package br.edu.insper.desagil.aps5.chatogpt;

public class Interacao {
	private String pergunta;
	private String resposta;

	public Interacao() {
		this.pergunta = null;
		this.resposta = null;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getResposta() {
		return resposta;
	}

	public void responde(String resposta) {
		if (pergunta == null) {
			throw new IllegalStateException("Nenhuma pergunta foi feita.");
		}
		this.resposta = resposta;
	}

	public int calcula() {
		if (pergunta == null || resposta == null) {
			return 0;
		}
		return pergunta.length() + resposta.length();
	}
}
