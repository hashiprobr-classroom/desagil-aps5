package br.edu.insper.desagil.pi.imovel;

public class Predio {
    private int numero;
    private String nome;
    private SubSindico subSindico;

    public Predio(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public SubSindico getSubSindico() {
        return subSindico;
    }

    public void setSubSindico(SubSindico subSindico) {
        this.subSindico = subSindico;
    }
}
