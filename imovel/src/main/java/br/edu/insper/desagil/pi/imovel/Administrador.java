package br.edu.insper.desagil.pi.imovel;

import java.time.ZonedDateTime;

public abstract class Administrador {
    private String cpf;
    private String nome;
    private ZonedDateTime inicioMandato;
    private ZonedDateTime fimMandato;

    public Administrador(String cpf, String nome, ZonedDateTime inicioMandato, ZonedDateTime fimMandato) {
        this.cpf = cpf;
        this.nome = nome;
        this.inicioMandato = inicioMandato;
        this.fimMandato = fimMandato;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public ZonedDateTime getInicioMandato() {
        return inicioMandato;
    }

    public void setInicioMandato(ZonedDateTime inicioMandato) {
        this.inicioMandato = inicioMandato;
    }

    public ZonedDateTime getFimMandato() {
        return fimMandato;
    }

    public void setFimMandato(ZonedDateTime fimMandato) {
        this.fimMandato = fimMandato;
    }

    public abstract void avisa();
}
