package com.example.demo.controller;

import com.example.demo.domain.InfoVO;
import com.example.demo.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    private InfoService infoService;

    @GetMapping
    public List<InfoVO> findAllInfo() { return infoService.findAllInfo(); }
}
