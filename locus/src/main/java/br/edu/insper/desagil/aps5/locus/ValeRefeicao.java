package br.edu.insper.desagil.aps5.locus;

public class ValeRefeicao extends Vale {
    public ValeRefeicao(String numero, PessoaJuridica empresa, PessoaFisica colaborador) {
        super(numero, empresa, colaborador);
    }

    @Override
    public double calculaCashback() {
        return 0;
    }
}
