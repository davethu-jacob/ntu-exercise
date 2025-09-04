package com.headfirst.ch11;

import java.util.Comparator;
import java.util.List;

public class Jukebox5 {
    public static void main(String[] args) {
        new Jukebox5().go();
    }

    private void go() {
        List<SongsV3> songList = MockMoreSongsV3.getSongsV3();
        System.out.println(songList);

        TitleCompare titleCompare = new TitleCompare();
        songList.sort(titleCompare);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        System.out.println(songList);

        songList.sort((o1, o2) -> o2.getTitle().compareTo(o1.getTitle()));
    }
}

class TitleCompare implements Comparator<SongsV3> {

    @Override
    public int compare(SongsV3 o1, SongsV3 o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}


