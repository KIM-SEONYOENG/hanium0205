package com.example.demo.mapper;

import com.example.demo.domain.VolunteerVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VolunteerMapper {
    public List<VolunteerVO> findAllVolunteer();
}
