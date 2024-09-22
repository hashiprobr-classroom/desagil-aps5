package br.edu.insper.desagil.aps5.groups;

public class Usuario {
    private String login;
    private String nome;

    public Usuario(String login, String nome) {
        this.login = login;
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
