package br.edu.insper.desagil.aps5.groups;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private Turma turma;
    private List<String> loginsMembros;

    public Grupo(Turma turma) {
        this.turma = turma;
        this.loginsMembros = new ArrayList<>();
    }

    public Turma getTurma() {
        return turma;
    }

    public List<String> getLoginsMembros() {
        return loginsMembros;
    }

    public boolean temLoginMembro(String login) {
        return loginsMembros.contains(login);
    }

    public void adicionaMembro(Usuario usuario) {
        loginsMembros.add(usuario.getNome());
    }
}
