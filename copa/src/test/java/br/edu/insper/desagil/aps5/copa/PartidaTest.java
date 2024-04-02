package br.edu.insper.desagil.aps5.copa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

public class PartidaTest {
    private Time mandante;
    private Time visitante;
    private Partida p;

    @BeforeEach
    void setUp() {
        mandante = mock(Time.class);
        visitante = mock(Time.class);
        p = new Partida(mandante, visitante);
    }

    @Test
    void constroi() {
        assertSame(mandante, p.getMandante());
        assertSame(visitante, p.getVisitante());
        assertEquals(0, p.getGolsMandante());
        assertEquals(0, p.getGolsVisitante());
    }

    @Test
    void marcaGolMandante() {
        p.marcaGolMandante();
        assertEquals(1, p.getGolsMandante());
    }

    @Test
    void marcaGolVisitante() {
        p.marcaGolVisitante();
        assertEquals(1, p.getGolsVisitante());
    }
}
