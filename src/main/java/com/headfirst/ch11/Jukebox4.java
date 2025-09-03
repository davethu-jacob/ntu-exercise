package com.headfirst.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Jukebox4 {
    public static void main(String[] args) {
        new Jukebox4().go();
    }

    private void go() {
        List<SongsV3> songList = MockSongsV3.getSongsV3();
        System.out.println("Song list in the order of input: " + songList);
        Collections.sort(songList);
        System.out.println("Song  list sorted by title: " + songList);

        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        System.out.println("Song list sorted by artist name: " + songList);
    }
}

class ArtistCompare implements Comparator<SongsV3> {

    @Override
    public int compare(SongsV3 o1, SongsV3 o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }
}

class MockSongsV3 {
    public static List<SongsV3> getSongsV3() {
        List<SongsV3> songsV3 = new ArrayList<>();
        songsV3.add(new SongsV3("somersault", "zero 7", 147));
        songsV3.add(new SongsV3("cassidy", "grateful dead", 158));
        songsV3.add(new SongsV3("$10", "hitchhiker", 140));
        songsV3.add(new SongsV3("havana", "cabello", 140));
        songsV3.add(new SongsV3("Cassidy", "grateful dead", 158));
        songsV3.add(new SongsV3("50 ways", "simon", 102));
        return songsV3;
    }
}

class SongsV3 implements Comparable<SongsV3> {
    private final String title;
    private final String artist;
    private final int bpm;

    SongsV3(String title, String artist, int bpm) {
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

    @Override
    public int compareTo(SongsV3 o) {
        return this.title.compareTo(o.title);
    }
}
