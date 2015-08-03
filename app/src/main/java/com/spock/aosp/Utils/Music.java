package com.spock.aosp.Utils;

/**
 * Created by greden on 2015/7/26 0026.
 */
public class Music {

    private String filename;
    private String Title;
    private int  duration;
    private	String artist;
    private String location;
    private String album;


    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getData() {
        return location;
    }
    public void setData(String location) {
        this.location = location;
    }

}
