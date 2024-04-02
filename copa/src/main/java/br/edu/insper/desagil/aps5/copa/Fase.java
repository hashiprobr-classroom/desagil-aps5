package br.edu.insper.desagil.aps5.copa;

import java.util.List;

public abstract class Fase {
    private List<Partida> partidas;

    // Se você usou public, tudo bem. Aceito os dois nesse caso.
    protected Fase(List<Partida> partidas) {
        this.partidas = partidas;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public abstract List<String> defineClassificados();
}
