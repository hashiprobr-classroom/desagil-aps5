package br.edu.insper.desagil.aps5.locus;

import java.util.List;

public class ValeAlimentacao extends Vale {
    private List<String> excecoes;

    public ValeAlimentacao(String numero, PessoaJuridica empresa, PessoaFisica colaborador, List<String> excecoes) {
        super(numero, empresa, colaborador);
        this.excecoes = excecoes;
    }

    public List<String> getExcecoes() {
        return excecoes;
    }
}
