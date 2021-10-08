package com.example.demo.mapper;

import com.example.demo.domain.InfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InfoMapper {
    public List<InfoVO> findAllInfo();
}
