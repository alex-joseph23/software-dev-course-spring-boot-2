package com.example.mycollections.models;

public class Album {
    private String title;
    private String artist;
    private int year;
    private int tracks;

public Album(String title, String artist, int year, int tracks){
this.title =title;
this.artist = artist;
this.year = year;
this.tracks = tracks;
}

public String getTitle() {
    return title;
}
public String getArtist() {
    return artist;
}
public int getYear() {
    return year;
}
public int getTracks() {
    return tracks;
}

@Override
public String toString() {
    return title + " by " + artist + " (" + year + "), " +
            tracks + " tracks";
}}

