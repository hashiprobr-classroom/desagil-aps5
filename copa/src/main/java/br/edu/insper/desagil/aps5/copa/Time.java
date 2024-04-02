package br.edu.insper.desagil.aps5.copa;

public class Time {
    private String sigla;
    private String nome;

    public Time(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
