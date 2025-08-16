package com.niloufar.training.learningspring.patherns.bakeries;

public class VotingRunnable implements  Runnable{

    private Design d;
    protected  boolean doStop = false;

    public VotingRunnable(Design d){this.d=d; }

    @Override
    public void run() {
        System.out.println("Voting is going on for : "+ d.getName());
        d.getVotes().add(1L);

    }
}
