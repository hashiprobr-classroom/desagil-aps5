package br.edu.insper.desagil.aps5.locus;

public class PessoaJuridica {
    private String cnpj;
    private String nome;

    public PessoaJuridica(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vale emite(PessoaFisica colaborador) {
        return null; // finja que há outro código aqui
    }
}
