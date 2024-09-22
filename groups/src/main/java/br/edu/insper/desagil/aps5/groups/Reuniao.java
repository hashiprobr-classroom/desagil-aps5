package br.edu.insper.desagil.aps5.groups;

import java.util.ArrayList;
import java.util.List;

public class Reuniao {
    private List<String> loginsParticipantes;
    private List<String> mensagens;

    public Reuniao(List<String> loginsParticipantes) {
        this.loginsParticipantes = loginsParticipantes;
        this.mensagens = new ArrayList<>();
    }

    public List<String> getLoginsParticipantes() {
        return loginsParticipantes;
    }

    public List<String> getMensagens() {
        return mensagens;
    }

    public void postaMensagem(Usuario usuario, String mensagem) {
        if (!loginsParticipantes.contains(usuario.getLogin())) {
            throw new IllegalArgumentException("Usuário não é participante da reunião!");
        }
        mensagens.add(mensagem);
    }
}
