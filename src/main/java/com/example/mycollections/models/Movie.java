package com.example.mycollections.models;

public class Movie {
private String title;
private String director;
private int year;
private int runtime;

public Movie(String title, String director, int year, int runtime){
    this.title = title;
    this.director = director;
    this.year = year;
    this.runtime = runtime;
}
public String getTitle() {
    return title;
}
public String getDirector() {
    return director;
}
public int getYear() {
    return year;
}
public int getRuntime() {
    return runtime;
}
@Override
public String toString() {
    return title + " directed by " + director + " (" + year + "), " +
            runtime + " minutes";
}}
