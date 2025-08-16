package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.Jukebox;

public class Song {
    private int ID;
    private String title;
    private String artist;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Song(int ID, String title, String artist) {
        this.ID = ID;
        this.title = title;
        this.artist = artist;
    }
}
