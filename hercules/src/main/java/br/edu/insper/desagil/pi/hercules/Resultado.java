package br.edu.insper.desagil.pi.hercules;

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
            String tipo = medalha.getTipo();
            if (tipo.equals("bronze")) {
                pontos += 1;
            } else if (tipo.equals("prata")) {
                pontos += 2;
            } else if (tipo.equals("ouro")) {
                pontos += 3;
            } else {
                throw new IllegalArgumentException("Medalha inválida!");
            }
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
