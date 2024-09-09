package br.edu.insper.desagil.aps5.ww3;

public class Team {
    private String name;
    private Wrestler first;
    private Wrestler second;

    public Team(Wrestler first, Wrestler second) {
        this.first = first;
        this.second = second;
    }

    public Wrestler getFirst() {
        return first;
    }

    public Wrestler getSecond() {
        return second;
    }
}
