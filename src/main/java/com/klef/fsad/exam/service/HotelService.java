package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.model.Hotel;
import com.klef.fsad.exam.repository.HotelRepository;

@Service
public class HotelService {

    @Autowired
    private HotelRepository repo;

    // POST → Add Hotel
    public Hotel addHotel(Hotel h) {
        return repo.save(h);
    }

    // PUT → Update Hotel
    public Hotel updateHotel(Hotel h) {
        return repo.save(h);
    }
}