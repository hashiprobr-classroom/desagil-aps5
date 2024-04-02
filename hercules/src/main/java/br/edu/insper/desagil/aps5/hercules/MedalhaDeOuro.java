package br.edu.insper.desagil.aps5.hercules;

public class MedalhaDeOuro extends Medalha {
    public MedalhaDeOuro(String tipo) {
        super(tipo);
    }

    @Override
    public int getPontos() {
        return 3;
    }
}
