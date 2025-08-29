package com.headfirst.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jukebox2 {
    public static void main(String[] args) {
        Jukebox2 jukebox = new Jukebox2();
        jukebox.go();
//        new Jukebox2().go();

    }

    public void go() {
        List<SongsV2> songList = MockSongsV2.getSongsV2();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
}

class MockSongsV2 {
    public static List<SongsV2> getSongsV2() {
        List<SongsV2> songsV2 = new ArrayList<>();
        songsV2.add(new SongsV2("somersault", "zero 7", 147));
        songsV2.add(new SongsV2("cassidy", "grateful dead", 158));
        songsV2.add(new SongsV2("$10", "hitchhiker", 140));
        songsV2.add(new SongsV2("havana", "cabello", 140));
        songsV2.add(new SongsV2("Cassidy", "grateful dead", 158));
        songsV2.add(new SongsV2("50 ways", "simon", 102));
        return songsV2;
    }
}

class SongsV2 {
    private String title;
    private String artist;
    private int bpm;

    SongsV2(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return title;
    }
}

