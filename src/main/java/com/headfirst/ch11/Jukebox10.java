package com.headfirst.ch11;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Jukebox10 {
    public static void main(String[] args) {
        new Jukebox10().go();
    }

    private void go() {
        List<SongsV4> songList = MockMoreSongsV4.getSongsV4();
        System.out.println(songList);

        songList.sort(((o1, o2) -> o1.getTitle().compareTo(o2.getTitle())));
        System.out.println(songList);

        Set<SongsV4> songSet = new TreeSet<>(songList);
        System.out.println(songSet);

    }
}
