package br.edu.insper.desagil.aps5.copa;

import java.util.List;

public abstract class Fase {
    private List<Partida> partidas;

    protected Fase(List<Partida> partidas) {
        this.partidas = partidas;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public abstract List<String> defineClassificados();
}
