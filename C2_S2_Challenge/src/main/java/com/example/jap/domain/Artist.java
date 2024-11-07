package com.example.jap.domain;


public class Artist {

    private String artistId;
    private String artistName;

    // No-argument constructor
    public Artist() {
    }

    // Parameterized constructor
    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    // Getters and Setters
    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Artist{" +
                "artistId='" + artistId + '\'' +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}

