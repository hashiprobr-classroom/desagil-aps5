package br.edu.insper.desagil.aps5.groups;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReuniaoTest {
    private Reuniao r;

    @BeforeEach
    void setUp() {
        List<String> loginsParticipantes = new ArrayList<>();
        loginsParticipantes.add("alisonao");
        loginsParticipantes.add("antonioaaj");
        r = new Reuniao(loginsParticipantes);
    }

    @Test
    void postaMensagens() {
        r.postaMensagem(criaUsuario("alisonao"), "mensagem1");
        r.postaMensagem(criaUsuario("antonioaaj"), "mensagem2");
        assertEquals(List.of("mensagem1", "mensagem2"), r.getMensagens());
    }

    @Test
    void naoPostaMensagem() {
        assertThrows(IllegalArgumentException.class, () -> {
            r.postaMensagem(criaUsuario("cauepda"), "mensagem3");
        });
        assertTrue(r.getMensagens().isEmpty());
    }

    private Usuario criaUsuario(String login) {
        Usuario usuario = mock(Usuario.class);
        when(usuario.getLogin()).thenReturn(login);
        return usuario;
    }
}
