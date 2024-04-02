package br.edu.insper.desagil.aps5.hercules;

public class Medalha {
    private String tipo;

    public Medalha(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPontos() {
        throw new IllegalArgumentException("Medalha inválida!");
    }
}
