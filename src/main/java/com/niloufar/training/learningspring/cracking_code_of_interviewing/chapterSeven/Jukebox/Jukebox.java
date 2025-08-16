package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.Jukebox;

import java.util.Set;

public class Jukebox {

    private CDPlayer cdPlayer;
    private User user;
    private Set<CD> cdCollection;

    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<CD> getCdCollection() {
        return cdCollection;
    }

    public void setCdCollection(Set<CD> cdCollection) {
        this.cdCollection = cdCollection;
    }

    public Jukebox(CDPlayer cdPlayer, User user, Set<CD> cdCollection) {
        this.cdPlayer = cdPlayer;
        this.user = user;
        this.cdCollection = cdCollection;
    }
// private SonngSelector ts;


}
