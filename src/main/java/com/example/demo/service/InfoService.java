package com.example.demo.service;

import com.example.demo.domain.InfoVO;
import com.example.demo.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {
    @Autowired
    InfoMapper infoDao;

    public List<InfoVO> findAllInfo() { return infoDao.findAllInfo(); }
}
