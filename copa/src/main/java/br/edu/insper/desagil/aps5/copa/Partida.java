package br.edu.insper.desagil.aps5.copa;

public class Partida {
    private Time mandante;
    private Time visitante;
    private int golsMandante;
    private int golsVisitante;

    public Partida(Time mandante, Time visitante) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.golsMandante = 0;
        this.golsVisitante = 0;
    }

    public Time getMandante() {
        return mandante;
    }

    public Time getVisitante() {
        return visitante;
    }

    public int getGolsMandante() {
        return golsMandante;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    public void marcaGolMandante() {
        golsMandante++;
    }

    public void marcaGolVisitante() {
        golsVisitante++;
    }
}
