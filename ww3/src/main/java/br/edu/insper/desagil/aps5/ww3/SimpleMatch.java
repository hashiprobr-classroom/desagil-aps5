package br.edu.insper.desagil.aps5.ww3;

public class SimpleMatch extends Match {
    private Wrestler faceWrestler;
    private Wrestler heelWrestler;

    public SimpleMatch(Wrestler faceWrestler, Wrestler heelWrestler) {
        this.faceWrestler = faceWrestler;
        this.heelWrestler = heelWrestler;
    }

    public Wrestler getFaceWrestler() {
        return faceWrestler;
    }

    public Wrestler getHeelWrestler() {
        return heelWrestler;
    }

    public void finish() {
        if (isFaceAdvantage()) {
            if (isHeelAdvantage()) {
                faceWrestler.addPoints(1);
                heelWrestler.addPoints(1);
            } else {
                faceWrestler.addPoints(2);
                heelWrestler.addPoints(0);
            }
        } else {
            if (isHeelAdvantage()) {
                faceWrestler.addPoints(0);
                heelWrestler.addPoints(2);
            } else {
                faceWrestler.addPoints(0);
                heelWrestler.addPoints(0);
            }
        }
    }
}
