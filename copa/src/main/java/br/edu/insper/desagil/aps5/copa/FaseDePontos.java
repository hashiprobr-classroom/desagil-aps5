package br.edu.insper.desagil.aps5.copa;

import java.util.*;

public class FaseDePontos extends Fase {
    public FaseDePontos(List<Partida> partidas) {
        super(partidas);
    }

    public Map<String, Integer> definePontos() {
        Map<String, Integer> pontos = new HashMap<>();
        for (Partida partida : getPartidas()) {
            String siglaMandante = partida.getMandante().getSigla();
            String siglaVisitante = partida.getVisitante().getSigla();

            if (!pontos.containsKey(siglaMandante)) {
                pontos.put(siglaMandante, 0);
            }
            if (!pontos.containsKey(siglaVisitante)) {
                pontos.put(siglaVisitante, 0);
            }

            int golsMandante = partida.getGolsMandante();
            int golsVisitante = partida.getGolsVisitante();

            if (golsMandante > golsVisitante) {
                pontos.put(siglaMandante, pontos.get(siglaMandante) + 2);
            } else if (golsMandante < golsVisitante) {
                pontos.put(siglaVisitante, pontos.get(siglaVisitante) + 2);
            } else {
                pontos.put(siglaMandante, pontos.get(siglaMandante) + 1);
                pontos.put(siglaVisitante, pontos.get(siglaVisitante) + 1);
            }
        }
        return pontos;
    }

    @Override
    public List<String> defineClassificados() {
        Map<String, Integer> pontos = definePontos();
        int maximo = Collections.max(pontos.values());

        List<String> classificados = new ArrayList<>();
        for (String sigla : pontos.keySet()) {
            if (pontos.get(sigla) == maximo) {
                classificados.add(sigla);
            }
        }
        return classificados;
    }
}
