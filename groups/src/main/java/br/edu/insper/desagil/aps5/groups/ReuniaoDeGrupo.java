package br.edu.insper.desagil.aps5.groups;

public class ReuniaoDeGrupo extends Reuniao {
    private Grupo grupo;

    public ReuniaoDeGrupo(Grupo grupo) {
        super(grupo.getLoginsMembros());
        this.grupo = grupo;
    }

    @Override
    public void postaMensagem(Usuario usuario, String mensagem) {
        if (!getLoginsParticipantes().contains(usuario.getLogin()) && !grupo.getTurma().temProfessor(usuario)) {
            throw new IllegalArgumentException("Usuário não é participante ou professor!");
        }
        getMensagens().add(mensagem);
    }
}
