package com.headfirst.ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jukebox8 {
    public static void main(String[] args) {
        new Jukebox8().go();
    }

    private void go() {
        List<SongsV3> songList = MockMoreSongsV3.getSongsV3();
        System.out.println(songList);

        songList.sort(((o1, o2) -> o1.getTitle().compareTo(o2.getTitle())));
        System.out.println(songList);

        Set<SongsV3> songSet = new HashSet<>(songList);
        System.out.println(songSet);
    }
}

class MockMoreSongsV3 {
    public static List<SongsV3> getSongsV3() {
        List<SongsV3> songsV3 = new ArrayList<>();
        songsV3.add(new SongsV3("somersault", "zero 7", 147));
        songsV3.add(new SongsV3("cassidy", "grateful dead", 158));
        songsV3.add(new SongsV3("$10", "hitchhiker", 140));
        songsV3.add(new SongsV3("havana", "cabello", 140));
        songsV3.add(new SongsV3("$10", "hitchhiker", 140));
        songsV3.add(new SongsV3("cassidy", "grateful dead", 158));
        songsV3.add(new SongsV3("50 ways", "simon", 102));
        return songsV3;
    }
}

class SongsV4 implements Comparable<SongsV4> {
    private String title;
    private String artist;
    private int bpm;

    SongsV4(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    @Override
    public boolean equals(Object obj) {
        SongsV4 other = (SongsV4) obj;
        return title.equals(other.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
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
    public int compareTo(SongsV4 o) {
        return this.title.compareTo(o.getTitle());
    }

    @Override
    public String toString() {
        return title;
    }
}

