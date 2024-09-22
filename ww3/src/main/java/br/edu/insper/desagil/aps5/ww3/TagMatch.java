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
        faceTeam.getFirst().addPoints(0.5);
        faceTeam.getSecond().addPoints(0.5);
        heelTeam.getFirst().addPoints(0.5);
        heelTeam.getSecond().addPoints(0.5);
    }

    @Override
    protected void finishWithHeelAdvantage() {
        faceTeam.getFirst().addPoints(1);
        faceTeam.getSecond().addPoints(1);
        heelTeam.getFirst().addPoints(0);
        heelTeam.getSecond().addPoints(0);
    }

    @Override
    protected void finishWithFaceAdvantage() {
        faceTeam.getFirst().addPoints(0);
        faceTeam.getSecond().addPoints(0);
        heelTeam.getFirst().addPoints(1);
        heelTeam.getSecond().addPoints(1);
    }

    @Override
    protected void finishWithoutAdvantages() {
        faceTeam.getFirst().addPoints(0);
        faceTeam.getSecond().addPoints(0);
        heelTeam.getFirst().addPoints(0);
        heelTeam.getSecond().addPoints(0);
    }
}
