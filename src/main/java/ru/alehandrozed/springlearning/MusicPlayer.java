package ru.alehandrozed.springlearning;

public class MusicPlayer {
    private Music music;
//IoS
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void PlayMusic(){
        System.out.println("Playing: " +music.getSong());

    }
}
