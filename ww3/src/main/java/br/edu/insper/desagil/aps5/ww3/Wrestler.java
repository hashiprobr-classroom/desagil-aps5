package br.edu.insper.desagil.aps5.ww3;

public class Wrestler {
    private int id;
    private String name;
    private double points;

    public Wrestler(int id, String name, double points) {
        this.id = id;
        this.name = name;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPoints() {
        return points;
    }

    public void addPoints(double points) {
        this.points += points;
    }
}
