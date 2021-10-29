package com.example.demo.controller;

import com.example.demo.domain.LocationVO;
import com.example.demo.domain.UserVO;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationService locationService;

    @GetMapping
    public List<LocationVO> findAllLocation() {
        return locationService.findAllLocation();
    }

    @GetMapping("/search/uid")
    public List<LocationVO> findUserByUid(@RequestParam("uid") long _uid) { return locationService.findLocationByUid(_uid); }

    @PostMapping("/add")
    public LocationVO addLocation(@RequestBody LocationVO newLocation) { return locationService.addLocation(newLocation); }

    @DeleteMapping("/delete/{lid}")
    public void deleteUser(@PathVariable long _lid) { locationService.deleteLocation(_lid); }
}
