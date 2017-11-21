package com.example.milos.androidtest;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by milos on 21/11/2017.
 */
@Entity (tableName = "music")
public class MusicEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name="album_name")
    private String album;

    @ColumnInfo(name="artist")
    private String artist;

    @ColumnInfo(name="genre")
    private String genre;

    @ColumnInfo(name="year")
    private String year;

    @ColumnInfo(name="rate")
    private double rate;

    @ColumnInfo(name="have")
    private boolean have;

    @ColumnInfo(name="user_amount")
    private long user;

    @ColumnInfo(name="image_url")
    private String image;

    public MusicEntity() {
    }

    public MusicEntity(String album, String artist, String genre, String year) {
        this.album = album;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isHave() {
        return have;
    }

    public void setHave(boolean have) {
        this.have = have;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
