package com.example.demo;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public String play(){
        return music.playSong();
    }
}
