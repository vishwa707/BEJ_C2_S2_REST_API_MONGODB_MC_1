package com.example.jap.service;

import com.example.jap.domain.Track;
import com.example.jap.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements ITrackService {

    @Autowired
    private TrackRepository trackRepository;

    @Override
    public Track saveTrack(Track track) {
        try {
            return trackRepository.save(track);
        } catch (Exception e) {
            throw new RuntimeException("Error saving track: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteTrack(String trackId) {
        try {
            trackRepository.deleteById(trackId);
            return true;
        } catch (EmptyResultDataAccessException e) {
            throw new RuntimeException("Track not found with id: " + trackId);
        }
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public List<Track> getTracksWithRatingGreaterThan4() {
        return trackRepository.findAllByRatingGreaterThan4();
    }

    @Override
    public List<Track> getTracksByArtist(String artistName) {
        return trackRepository.findAllByArtistJustinBieber();
    }
}

