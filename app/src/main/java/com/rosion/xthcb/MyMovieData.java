package com.rosion.xthcb;

public class MyMovieData {

    private String movieName;
    private String movieDate;

    public MyMovieData (String movieName, String movieDate) {
        this.movieName = movieName;
        this.movieDate = movieDate;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }
}