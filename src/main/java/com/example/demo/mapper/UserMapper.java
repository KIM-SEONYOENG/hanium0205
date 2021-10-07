package com.example.demo.mapper;

import com.example.demo.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<UserVO> findAllUser();
    public UserVO findUserById(@Param("id") String id);
    public UserVO findUserByUid(@Param("_uid") long _uid);
    public int addUser(@Param("newUser") UserVO newUser);
    public int changePassword(@Param("changeUser") UserVO changUser);
    public void deleteUser(@Param("id") String id);
}
