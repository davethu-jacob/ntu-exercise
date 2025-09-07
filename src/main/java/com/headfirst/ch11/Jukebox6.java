package com.headfirst.ch11;

import java.util.List;

public class Jukebox6 {
    public static void main(String[] args) {
        new Jukebox6().go();
    }

    private void go() {
        List<SongsV3> songList = MockSongsV3.getSongsV3();
        System.out.println(songList);

        songList.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        System.out.println(songList);

        songList.sort((o1, o2) -> o1.getArtist().compareTo(o2.getArtist()));
        System.out.println(songList);

    }
}
