package com.example.jap.repository;

import com.example.jap.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

public interface TrackRepository extends MongoRepository<Track, String> {

    // Fetch all tracks with rating greater than 4
    @Query("{'trackRating': {$gt: 4}}")
    List<Track> findAllByRatingGreaterThan4();

    // Fetch all tracks for the artist "Justin Bieber"
    @Query("{'trackArtist.artistName': 'Justin Bieber'}")
    List<Track> findAllByArtistJustinBieber();
}

