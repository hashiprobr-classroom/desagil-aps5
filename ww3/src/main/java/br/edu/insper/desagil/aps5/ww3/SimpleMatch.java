package br.edu.insper.desagil.aps5.ww3;

public class SimpleMatch {
    private Wrestler faceWrestler;
    private Wrestler heelWrestler;
    private boolean faceAdvantage;
    private boolean heelAdvantage;

    public SimpleMatch(Wrestler faceWrestler, Wrestler heelWrestler) {
        this.faceWrestler = faceWrestler;
        this.heelWrestler = heelWrestler;
        this.faceAdvantage = false;
        this.heelAdvantage = false;
    }

    public Wrestler getFaceWrestler() {
        return faceWrestler;
    }

    public Wrestler getHeelWrestler() {
        return heelWrestler;
    }

    public boolean isFaceAdvantage() {
        return faceAdvantage;
    }

    public void setFaceAdvantage(boolean faceAdvantage) {
        this.faceAdvantage = faceAdvantage;
    }

    public boolean isHeelAdvantage() {
        return heelAdvantage;
    }

    public void setHeelAdvantage(boolean heelAdvantage) {
        this.heelAdvantage = heelAdvantage;
    }

    public void finish() {
        if (faceAdvantage) {
            if (heelAdvantage) {
                faceWrestler.addPoints(1);
                heelWrestler.addPoints(1);
            } else {
                faceWrestler.addPoints(2);
                heelWrestler.addPoints(0);
            }
        } else {
            if (heelAdvantage) {
                faceWrestler.addPoints(0);
                heelWrestler.addPoints(2);
            } else {
                faceWrestler.addPoints(0);
                heelWrestler.addPoints(0);
            }
        }
    }
}
