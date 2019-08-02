package com.stackroute.service;


import com.stackroute.domain.Track;
import com.stackroute.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class TrackServiceImpl  implements TrackService {

TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) {
        return null;
    }


    @Override
    public Track updateTrack(Track track) {
        return null;
    }

    @Override
    public Track getTrackById(int id) {
        return null;
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public Track savedtrack(TrackService trackService) {
        return null;
    }

    @Override
    public Optional<Track> deleteTrackById(int id) {
        Optional<Track> optional = trackRepository.findById(id);
        trackRepository.deleteById(id);
        if (optional.isPresent()) {

        }
        return optional;

    }
}