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
        Track savedTrack = trackRepository.save(track);
        return savedTrack;
    }


    @Override
    public Track updateTrack(int id,Track track) {
        Track updateTrack = trackRepository.findById(id).get();
        updateTrack.setComments(track.getComments());
        return updateTrack;
    }

    @Override
    public Track getTrackById(int id) {
        Track getTrackById = trackRepository.findById(id).get();
        return getTrackById;
    }

    @Override
    public List<Track> getAllTracks()
    {
        List<Track> getAllTracks = trackRepository.findAll();
        return trackRepository.findAll();
    }

    @Override
    public Optional<Track> deleteTrackById(int id) {
        Optional<Track> optional = trackRepository.findById(id);
        if (optional.isPresent()) {
            trackRepository.deleteById(id);
        }

        return optional;

    }
}