package com.example.mycollections.models;

public class MusicAlbum extends LibraryItem {
    private String musician;
    private int trackAmount;

    public MusicAlbum(String name, String musician, int year, int trackAmount) {
        super(name, year);
        this.musician = musician;
        this.trackAmount = trackAmount;
    }

    public String getMusician() {
        return musician;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }

    public int getTrackAmount() {
        return trackAmount;
    }

    public void setTrackAmount(int trackAmount) {
        this.trackAmount = trackAmount;
    }

    @Override
    public String toString() {
        return "MusicAlbum{" +
                "musician='" + musician + '\'' +
                ", trackAmount=" + trackAmount +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", id=" + id +
                '}';
    }
}
