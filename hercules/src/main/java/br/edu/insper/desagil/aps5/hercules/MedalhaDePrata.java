package br.edu.insper.desagil.aps5.hercules;

public class MedalhaDePrata extends Medalha {
    public MedalhaDePrata(String tipo) {
        super(tipo);
    }

    @Override
    public int getPontos() {
        return 2;
    }
}
