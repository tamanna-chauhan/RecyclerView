package com.acadview.recyclerview;

public class Movie {

    private  String title, genre,year;
    private int image;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Movie(String title, String genre, String year){
        this.image = image;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.image = image;
    }

}
