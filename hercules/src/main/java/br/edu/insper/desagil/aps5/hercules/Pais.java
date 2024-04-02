package br.edu.insper.desagil.aps5.hercules;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nome;
    private int populacao;
    private double pib;
    private List<Medalha> medalhas;

    public Pais(String nome, int populacao, double pib) {
        this.nome = nome;
        this.populacao = populacao;
        this.pib = pib;
        this.medalhas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public double getPib() {
        return pib;
    }

    public List<Medalha> getMedalhas() {
        return medalhas;
    }
}
