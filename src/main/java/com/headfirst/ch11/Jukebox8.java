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
        List<SongsV4> songList = MockMoreSongsV4.getSongsV4();
        System.out.println(songList);

        songList.sort(((o1, o2) -> o1.getTitle().compareTo(o2.getTitle())));
        System.out.println(songList);

        Set<SongsV4> songSet = new HashSet<>(songList);
        System.out.println(songSet);
    }
}

class MockMoreSongsV4 {
    public static List<SongsV4> getSongsV4() {
        List<SongsV4> songsV4 = new ArrayList<>();
        songsV4.add(new SongsV4("somersault", "zero 7", 147));
        songsV4.add(new SongsV4("cassidy", "grateful dead", 158));
        songsV4.add(new SongsV4("$10", "hitchhiker", 140));
        songsV4.add(new SongsV4("havana", "cabello", 140));
        songsV4.add(new SongsV4("$10", "hitchhiker", 141));
        songsV4.add(new SongsV4("cassidy", "grateful dead", 158));
        songsV4.add(new SongsV4("50 ways", "simon", 102));
        return songsV4;
    }
}

class SongsV4 implements Comparable<SongsV4> {
    private final String title;
    private final String artist;
    private final int bpm;

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
        return (artist + ": " + title);
    }
}

