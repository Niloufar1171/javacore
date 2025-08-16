package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.Jukebox;

public class CDPlayer {
    private Playlist p;
    private  CD c;

    public CDPlayer(Playlist p, CD c) {
        this.p = p;
        this.c = c;
    }

    public Playlist getP() {
        return p;
    }

    public void setP(Playlist p) {
        this.p = p;
    }

    public CD getC() {
        return c;
    }

    public void setC(CD c) {
        this.c = c;
    }
    public void playSong(Song s){}
}
