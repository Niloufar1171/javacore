package com.niloufar.training.learningspring.patherns.bakeries;

public class CountingRunnable implements Runnable{

    private Design d;

    protected boolean doStop= false;

    public CountingRunnable(Design d){ this.d = d;}


    @Override
    public void run() {
        System.out.println("counting is going on for : "+ d.getName());
        System.out.println("Design " + d.getName() + " has " + d.getVotes().size()+ " votes. ");
    }
}
