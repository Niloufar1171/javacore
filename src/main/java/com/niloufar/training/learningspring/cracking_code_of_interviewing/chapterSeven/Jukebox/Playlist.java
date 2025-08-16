package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.Jukebox;

import java.util.Queue;

public class Playlist {
    private Song song;
    private Queue<Song> queue;
    public Song getNextToPlay(){
        return  queue.peek();
    }

    public Playlist(Song song, Queue<Song> queue) {
        this.song = song;
        this.queue = queue;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Queue<Song> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Song> queue) {
        this.queue = queue;
    }

    public  void QueueUpSong(Song s){
        queue.add(s);
    }
}
