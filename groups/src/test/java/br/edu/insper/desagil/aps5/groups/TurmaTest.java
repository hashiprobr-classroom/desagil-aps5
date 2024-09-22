package br.edu.insper.desagil.aps5.groups;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TurmaTest {
    private Turma t;

    @BeforeEach
    void setUp() {
        Usuario professor = criaUsuario("marceloh2");

        List<Usuario> alunos = new ArrayList<>();
        alunos.add(criaUsuario("alisonao"));
        alunos.add(criaUsuario("antonioaaj"));
        alunos.add(criaUsuario("cauepda"));

        t = new Turma(professor, alunos);
    }

    @Test
    void temProfessor() {
        Usuario usuario = criaUsuario("marceloh2");
        assertTrue(t.temProfessor(usuario));
    }

    @Test
    void naoTemProfessor() {
        Usuario usuario = criaUsuario("alisonao");
        assertFalse(t.temProfessor(usuario));
    }

    @Test
    void temAluno() {
        Usuario usuario = criaUsuario("antonioaaj");
        assertTrue(t.temAluno(usuario));
    }

    @Test
    void naoTemAluno() {
        Usuario usuario = criaUsuario("marceloh2");
        assertFalse(t.temAluno(usuario));
    }

    @Test
    void loginsAlunosSemGrupo() {
        List<Grupo> grupos = new ArrayList<>();

        Grupo grupo;

        grupo = mock(Grupo.class);
        when(grupo.temLoginMembro("alisonao")).thenReturn(true);
        when(grupo.temLoginMembro("antonioaaj")).thenReturn(false);
        when(grupo.temLoginMembro("cauepda")).thenReturn(false);
        grupos.add(grupo);

        grupo = mock(Grupo.class);
        when(grupo.temLoginMembro("alisonao")).thenReturn(false);
        when(grupo.temLoginMembro("antonioaaj")).thenReturn(true);
        when(grupo.temLoginMembro("cauepda")).thenReturn(false);
        grupos.add(grupo);

        grupo = mock(Grupo.class);
        when(grupo.temLoginMembro("alisonao")).thenReturn(true);
        when(grupo.temLoginMembro("antonioaaj")).thenReturn(true);
        when(grupo.temLoginMembro("cauepda")).thenReturn(false);
        grupos.add(grupo);

        List<String> logins = new ArrayList<>();
        logins.add("cauepda");

        assertEquals(logins, t.loginsAlunosSemGrupo(grupos));
    }

    private Usuario criaUsuario(String login) {
        Usuario usuario = mock(Usuario.class);
        when(usuario.getLogin()).thenReturn(login);
        return usuario;
    }
}
