package br.edu.insper.desagil.aps5.hercules;

public class MedalhaDeBronze extends Medalha {
    public MedalhaDeBronze(String tipo) {
        super(tipo);
    }

    @Override
    public int getPontos() {
        return 1;
    }
}
