package br.edu.insper.desagil.aps5.hercules;

import java.util.ArrayList;
import java.util.List;

public class Resultado {
    private List<Pais> paises;

    public Resultado() {
        this.paises = new ArrayList<>();
    }

    public void adicionaPais(String nome, int populacao, double pib) {
        paises.add(new Pais(nome, populacao, pib));
    }

    public void adicionaMedalha(int i, Medalha medalha) {
        paises.get(i).getMedalhas().add(medalha);
    }

    public int somaPontos(int i) {
        int pontos = 0;
        List<Medalha> medalhas = paises.get(i).getMedalhas();
        for (Medalha medalha : medalhas) {
            pontos += medalha.getPontos();
        }
        return pontos;
    }

    public String criaRelatorio(int i) {
        String relatorio = "";
        Pais pais = paises.get(i);
        relatorio += "Nome: " + pais.getNome() + "\n";
        relatorio += "População: " + pais.getPopulacao() + "\n";
        relatorio += "PIB: " + pais.getPib() + "\n";
        relatorio += "Pontos: " + somaPontos(i) + "\n";
        return relatorio;
    }
}
