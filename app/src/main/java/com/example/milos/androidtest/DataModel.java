package com.example.milos.androidtest;

public class DataModel {

    String artist;
    String album;
    String genre;
    String year;
    String rate;
    String have;
    String users;
    Integer image;

    public DataModel(String artist, String album, String genre, String year, String rate,
                     String have, String users, Integer image) {
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.year = year;
        this.rate = rate;
        this.have = have;
        this.users = users;
        this.image = image;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

    public String getYear() {
        return year;
    }

    public String getRate() {
        return rate;
    }

    public String getHave() {
        return have;
    }

    public String getUsers() {
        return users;
    }

    public Integer getImage() {
        return image;
    }
}