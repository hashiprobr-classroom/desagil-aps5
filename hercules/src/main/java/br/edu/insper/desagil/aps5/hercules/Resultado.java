package br.edu.insper.desagil.aps5.hercules;

import java.util.ArrayList;
import java.util.List;

public class Resultado {
    private List<String> nomes;
    private List<Integer> populacoes;
    private List<Double> pibs;
    private List<List<Medalha>> listasMedalhas;

    public Resultado() {
        this.nomes = new ArrayList<>();
        this.populacoes = new ArrayList<>();
        this.pibs = new ArrayList<>();
        this.listasMedalhas = new ArrayList<>();
    }

    public void adicionaPais(String nome, int populacao, double pib) {
        nomes.add(nome);
        populacoes.add(populacao);
        pibs.add(pib);
        listasMedalhas.add(new ArrayList<>());
    }

    public void adicionaMedalha(int i, Medalha medalha) {
        listasMedalhas.get(i).add(medalha);
    }

    public int somaPontos(int i) {
        int pontos = 0;
        List<Medalha> medalhas = listasMedalhas.get(i);
        for (Medalha medalha : medalhas) {
            pontos += medalha.getPontos();
        }
        return pontos;
    }

    public String criaRelatorio(int i) {
        String relatorio = "";
        relatorio += "Nome: " + nomes.get(i) + "\n";
        relatorio += "População: " + populacoes.get(i) + "\n";
        relatorio += "PIB: " + pibs.get(i) + "\n";
        relatorio += "Pontos: " + somaPontos(i) + "\n";
        return relatorio;
    }
}
