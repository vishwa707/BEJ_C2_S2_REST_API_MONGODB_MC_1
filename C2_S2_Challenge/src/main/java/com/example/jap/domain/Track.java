package com.example.jap.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tracks")
public class Track {

    @Id
    private String trackId;
    private String trackName;
    private double trackRating;
    private Artist trackArtist;

    // No-argument constructor
    public Track() {
    }

    // Parameterized constructor
    public Track(String trackId, String trackName, double trackRating, Artist trackArtist) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackRating = trackRating;
        this.trackArtist = trackArtist;
    }

    // Getters and Setters
    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public double getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(double trackRating) {
        this.trackRating = trackRating;
    }

    public Artist getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(Artist trackArtist) {
        this.trackArtist = trackArtist;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Track{" +
                "trackId='" + trackId + '\'' +
                ", trackName='" + trackName + '\'' +
                ", trackRating=" + trackRating +
                ", trackArtist=" + trackArtist +
                '}';
    }
}
