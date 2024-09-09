package br.edu.insper.desagil.aps5.locus;

public class PessoaFisica {
    private String cpf;
    private String nome;

    public PessoaFisica(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void bloqueia(Vale vale) {
        /* Finja que há algum código aqui. */
    }
}
