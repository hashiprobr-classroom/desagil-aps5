package br.edu.insper.desagil.aps5.copa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {
    private Time t;

    @BeforeEach
    void setUp() {
        t = new Time("FLA", "Flamengo");
    }

    @Test
    void constroi() {
        assertEquals("FLA", t.getSigla());
        assertEquals("Flamengo", t.getNome());
    }

    @Test
    void mudaNome() {
        t.setNome("Mengão");
        assertEquals("Mengão", t.getNome());
    }
}
