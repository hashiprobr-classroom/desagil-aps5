package br.edu.insper.desagil.aps5.locus;

import java.util.ArrayList;
import java.util.List;

public abstract class Vale {
    private String numero;
    private double saldo;
    private PessoaJuridica empresa;
    private PessoaFisica colaborador;
    private List<Transacao> extrato;

    public Vale(String numero, PessoaJuridica empresa, PessoaFisica colaborador) {
        this.numero = numero;
        this.saldo = 0;
        this.empresa = empresa;
        this.colaborador = colaborador;
        this.extrato = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public PessoaJuridica getEmpresa() {
        return empresa;
    }

    public PessoaFisica getColaborador() {
        return colaborador;
    }

    public List<Transacao> getExtrato() {
        return extrato;
    }

    public void atualiza(String descricao, double valor) {
        extrato.add(new Transacao(descricao, valor));
    }

    public double calculaTotal() {
        return saldo + calculaDiferenca();
    }

    public double calculaCashback() {
        return 0.01 * calculaDiferenca();
    }

    private double calculaDiferenca() {
        double d = 0;
        for (Transacao transacao: extrato) {
            d += transacao.getValor();
        }
        return d;
    }
}
