package Exercises.Exercise09_InnerClass;

// FIRST OFF
// WHO USES
// INNER CLASSES
// WHY DO U DO THIS
// ????

// Exercise 09 - lecture-78-challenge.txt

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }


    public void addSong(String title, double duration){
        this.songs.addS(new Song(title, duration));
        System.out.println("Added song " + title + " with a duration of " + duration);
    }

    public void addToPlayList(String title, ArrayList<Song> playlist){
       Song checkForSong = songs.findSong(title);
       if (checkForSong != null){
           playlist.add(0, checkForSong);
           System.out.println("The song " + title + " was successfully added to the playlist");
       } else{
           System.out.println("The song " + title + " is not in the album");
           return;
       }
    }



}


class SongList {
    private ArrayList<Song> songs;

    public SongList() {
        this.songs = new ArrayList<Song>();
    }

    public void addS(Song song) {
        if (songs.contains(song)) {
            System.out.println("The song is already in the playlist!");
            return;
        }
        this.songs.add(song);
    }

    public Song findSong(String title) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                System.out.println("Found the song " + title);
                return checkedSong;
            } else {
                System.out.println("The song is not in the playlist, try adding it");
                return null;
            }

        }
        return null;
    }
}
