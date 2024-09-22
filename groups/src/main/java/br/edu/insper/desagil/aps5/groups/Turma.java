package br.edu.insper.desagil.aps5.groups;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Usuario professor;
    private List<Usuario> alunos;

    public Turma(Usuario professor, List<Usuario> alunos) {
        this.professor = professor;
        this.alunos = alunos;
    }

    public boolean temProfessor(Usuario usuario) {
        return professor.getLogin().equals(usuario.getLogin());
    }

    public boolean temAluno(Usuario usuario) {
        for (Usuario aluno : alunos) {
            if (aluno.getLogin().equals(usuario.getLogin())) {
                return true;
            }
        }
        return false;
    }

    public List<String> loginsAlunosSemGrupo(List<Grupo> grupos) {
        List<String> logins = new ArrayList<>();

        for (Usuario aluno : alunos) {
            String login = aluno.getLogin();

            boolean semGrupo = true;

            for (Grupo grupo : grupos) {
                if (grupo.temLoginMembro(login)) {
                    semGrupo = false;
                    break;
                }
            }

            if (semGrupo) {
                logins.add(login);
            }
        }

        return logins;
    }
}
