package com.example.demo.controller;

import com.example.demo.domain.VolunteerVO;
import com.example.demo.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/volunteer")
public class VolunteerController {
    @Autowired
    VolunteerService volunteerService;

    @GetMapping
    public List<VolunteerVO> findAllVolunteer() { return volunteerService.findAllVolunteer(); }
}

