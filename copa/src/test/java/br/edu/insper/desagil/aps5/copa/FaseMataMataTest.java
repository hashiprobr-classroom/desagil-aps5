package br.edu.insper.desagil.aps5.copa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FaseMataMataTest {
    private List<Partida> partidas;
    private FaseMataMata f;

    @BeforeEach
    void setUp() {
        partidas = new ArrayList<>();
        f = new FaseMataMata(partidas);
    }

    private Time criaTime(String sigla) {
        Time time = mock(Time.class);
        when(time.getSigla()).thenReturn(sigla);
        return time;
    }

    private void adicionaPartida(String siglaMandante, String siglaVisitante, int golsMandante, int golsVisitante) {
        Time mandante = criaTime(siglaMandante);
        Time visitante = criaTime(siglaVisitante);

        Partida partida = mock(Partida.class);
        when(partida.getMandante()).thenReturn(mandante);
        when(partida.getVisitante()).thenReturn(visitante);
        when(partida.getGolsMandante()).thenReturn(golsMandante);
        when(partida.getGolsVisitante()).thenReturn(golsVisitante);
        partidas.add(partida);
    }

    @Test
    void comEmpate() {
        adicionaPartida("FLA", "FLU", 1, 0);
        adicionaPartida("PAL", "COR", 1, 1);
        assertThrows(IllegalStateException.class, () -> {
            f.defineClassificados();
        });
    }

    @Test
    void semEmpate() {
        adicionaPartida("FLA", "FLU", 1, 0);
        adicionaPartida("PAL", "COR", 0, 1);
        assertEquals(List.of("FLA", "COR"), f.defineClassificados());
    }
}
