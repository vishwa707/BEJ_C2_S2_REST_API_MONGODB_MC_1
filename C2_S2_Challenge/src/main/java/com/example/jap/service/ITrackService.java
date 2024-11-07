package com.example.jap.service;

import com.example.jap.domain.Track;
import java.util.List;

public interface ITrackService {

    Track saveTrack(Track track);

    boolean deleteTrack(String trackId);

    List<Track> getAllTracks();

    List<Track> getTracksWithRatingGreaterThan4();

    List<Track> getTracksByArtist(String artistName);
}

