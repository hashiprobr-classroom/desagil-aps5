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

    @Override
    protected void finishWithFaceHeelAdvantage() {
        faceWrestler.addPoints(1);
        heelWrestler.addPoints(1);
    }

    @Override
    protected void finishWithHeelAdvantage() {
        faceWrestler.addPoints(2);
        heelWrestler.addPoints(0);
    }

    @Override
    protected void finishWithFaceAdvantage() {
        faceWrestler.addPoints(0);
        heelWrestler.addPoints(2);
    }

    @Override
    protected void finishWithoutAdvantages() {
        faceWrestler.addPoints(0);
        heelWrestler.addPoints(0);
    }
}
