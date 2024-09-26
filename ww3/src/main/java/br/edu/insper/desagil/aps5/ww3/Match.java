package br.edu.insper.desagil.aps5.ww3;

public abstract class Match {
    private boolean faceAdvantage;
    private boolean heelAdvantage;

    public Match() {
        this.faceAdvantage = false;
        this.heelAdvantage = false;
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
                finishWithFaceHeelAdvantage();
            } else {
                finishWithFaceAdvantage();
            }
        } else {
            if (heelAdvantage) {
                finishWithHeelAdvantage();
            } else {
                finishWithoutAdvantages();
            }
        }
    }

    protected abstract void finishWithFaceHeelAdvantage();
    protected abstract void finishWithFaceAdvantage();
    protected abstract void finishWithHeelAdvantage();
    protected abstract void finishWithoutAdvantages();
}
