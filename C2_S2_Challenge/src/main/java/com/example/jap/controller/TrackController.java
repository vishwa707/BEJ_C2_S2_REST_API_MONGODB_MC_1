package com.example.jap.controller;

import com.example.jap.domain.Track;
import com.example.jap.service.ITrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tracks")
public class TrackController {

    @Autowired
    private ITrackService trackService;

    // Save a Track
    @PostMapping
    public ResponseEntity<Track> saveTrack(@RequestBody Track track) {
        Track savedTrack = trackService.saveTrack(track);
        return new ResponseEntity<>(savedTrack, HttpStatus.CREATED);
    }

    // Delete a Track by ID
    @DeleteMapping("/{trackId}")
    public ResponseEntity<String> deleteTrack(@PathVariable String trackId) {
        boolean deleted = trackService.deleteTrack(trackId);
        return deleted ? new ResponseEntity<>("Track deleted successfully", HttpStatus.OK)
                : new ResponseEntity<>("Track not found", HttpStatus.NOT_FOUND);
    }

    // Get all Tracks
    @GetMapping
    public List<Track> getAllTracks() {
        return trackService.getAllTracks();
    }

    // Get Tracks with rating greater than 4
    @GetMapping("/rating")
    public List<Track> getTracksWithRatingGreaterThan4() {
        return trackService.getTracksWithRatingGreaterThan4();
    }

    // Get Tracks for artist "Justin Bieber"
    @GetMapping("/artist/justin-bieber")
    public List<Track> getTracksByArtist() {
        return trackService.getTracksByArtist("Justin Bieber");
    }
}
