package br.edu.insper.desagil.aps5.ww3;

public class TagMatch {
    private Team faceTeam;
    private Team heelTeam;
    private boolean faceAdvantage;
    private boolean heelAdvantage;

    public TagMatch(Team faceTeam, Team heelTeam) {
        this.faceTeam = faceTeam;
        this.heelTeam = heelTeam;
        this.faceAdvantage = false;
        this.heelAdvantage = false;
    }

    public Team getFaceTeam() {
        return faceTeam;
    }

    public Team getHeelTeam() {
        return heelTeam;
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
                faceTeam.getFirst().addPoints(0.5);
                faceTeam.getSecond().addPoints(0.5);
                heelTeam.getFirst().addPoints(0.5);
                heelTeam.getSecond().addPoints(0.5);
            } else {
                faceTeam.getFirst().addPoints(1);
                faceTeam.getSecond().addPoints(1);
                heelTeam.getFirst().addPoints(0);
                heelTeam.getSecond().addPoints(0);
            }
        } else {
            if (heelAdvantage) {
                faceTeam.getFirst().addPoints(0);
                faceTeam.getSecond().addPoints(0);
                heelTeam.getFirst().addPoints(1);
                heelTeam.getSecond().addPoints(1);
            } else {
                faceTeam.getFirst().addPoints(0);
                faceTeam.getSecond().addPoints(0);
                heelTeam.getFirst().addPoints(0);
                heelTeam.getSecond().addPoints(0);
            }
        }
    }
}
