package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.klef.fsad.exam.model.Hotel;
import com.klef.fsad.exam.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService service;

    // POST → Add Hotel
    @PostMapping
    public Hotel addHotel(@RequestBody Hotel h) {
        return service.addHotel(h);
    }

    // PUT → Update Hotel
    @PutMapping
    public Hotel updateHotel(@RequestBody Hotel h) {
        return service.updateHotel(h);
    }
}