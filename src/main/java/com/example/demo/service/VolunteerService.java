package com.example.demo.service;

import com.example.demo.domain.VolunteerVO;
import com.example.demo.mapper.VolunteerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerService {
    @Autowired
    VolunteerMapper volunteerDao;

    public List<VolunteerVO> findAllVolunteer() { return volunteerDao.findAllVolunteer(); }
}
