package br.edu.insper.desagil.aps5.copa;

import java.util.ArrayList;
import java.util.List;

public class FaseMataMata extends Fase {
    public FaseMataMata(List<Partida> partidas) {
        super(partidas);
    }

    @Override
    public List<String> defineClassificados() {
        List<String> classificados = new ArrayList<>();
        for (Partida partida : getPartidas()) {
            int golsMandante = partida.getGolsMandante();
            int golsVisitante = partida.getGolsVisitante();

            if (golsMandante == golsVisitante) {
                throw new IllegalStateException("Não pode haver empate");
            }

            if (golsMandante > golsVisitante) {
                classificados.add(partida.getMandante().getSigla());
            } else {
                classificados.add(partida.getVisitante().getSigla());
            }
        }
        return classificados;
    }
}
