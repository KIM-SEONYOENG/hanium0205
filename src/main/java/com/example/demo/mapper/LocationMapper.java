package com.example.demo.mapper;

import com.example.demo.domain.LocationVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LocationMapper {
    public List<LocationVO> findAllLocation();
    public List<LocationVO> findLocationByUid(@Param("_uid") long _uid);
    public LocationVO findLocationByLatLng(@Param("lat") double lat, @Param("lan") double lan);
    public void addLocation(@Param("newLocation") LocationVO newLocation);
    public void deleteLocation(@Param("_lid") long _lid);
}
