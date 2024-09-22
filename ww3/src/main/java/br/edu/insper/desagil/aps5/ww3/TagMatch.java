package br.edu.insper.desagil.aps5.ww3;

public class TagMatch extends Match {
    private Team faceTeam;
    private Team heelTeam;

    public TagMatch(Team faceTeam, Team heelTeam) {
        this.faceTeam = faceTeam;
        this.heelTeam = heelTeam;
    }

    public Team getFaceTeam() {
        return faceTeam;
    }

    public Team getHeelTeam() {
        return heelTeam;
    }

    @Override
    protected void finishWithFaceHeelAdvantage() {
        faceTeam.addPoints(0.5);
        heelTeam.addPoints(0.5);
    }

    @Override
    protected void finishWithHeelAdvantage() {
        faceTeam.addPoints(1);
        heelTeam.addPoints(0);
    }

    @Override
    protected void finishWithFaceAdvantage() {
        faceTeam.addPoints(0);
        heelTeam.addPoints(1);
    }

    @Override
    protected void finishWithoutAdvantages() {
        faceTeam.addPoints(0);
        heelTeam.addPoints(0);
    }
}
