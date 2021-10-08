package com.example.demo.service;

import com.example.demo.domain.LocationVO;
import com.example.demo.mapper.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    LocationMapper locationDao;

    public List<LocationVO> findAllLocation() { return locationDao.findAllLocation(); }
    public List<LocationVO> findLocationByUid(long _uid) { return locationDao.findLocationByUid(_uid); }
    public int addLocation(LocationVO newLocation) { return locationDao.addLocation(newLocation); }
    public void deleteLocation(long _lid) { locationDao.deleteLocation(_lid); }
}
