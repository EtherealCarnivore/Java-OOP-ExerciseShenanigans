package Exercises.Exercise09_InnerClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    // Exercise 09 - lecture-78-challenge.txt

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {



        Album album = new Album("The Dragon Becomes me", "Genji");
        album.addSong("Hanamura", 5.12); // add song to the album
        album.addSong("Omaewa", 100.2);
        albums.add(album); //add the album to the collection

        ArrayList<Song> playList = new ArrayList<Song>();
        albums.get(0).addToPlayList("Hanamura", playList);
        albums.get(0).addToPlayList("Omaewa", playList);

        Album album1 = new Album("Twin Dragons", "Hanzo");
        album1.addSong("Fear me", 5.43);
        albums.add(album1);

        ArrayList<Song> playList2 = new ArrayList<Song>();
        albums.get(1).addToPlayList("Fear me", playList2);



        System.out.println(Arrays.toString(playList.toArray())); // print array list
        System.out.println(Arrays.toString(playList2.toArray())); // second


    }
}
