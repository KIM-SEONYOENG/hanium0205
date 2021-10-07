package com.example.demo.service;

import com.example.demo.domain.UserVO;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userDao;

    public List<UserVO> findAllUser() {
        return userDao.findAllUser();
    }
    public UserVO findUserById(String id) { return userDao.findUserById(id); }
    public UserVO findUserByUid(long _uid) {return userDao.findUserByUid(_uid); }
    public int addUser(UserVO newUser) { return userDao.addUser(newUser); }
    public int changePassword(UserVO changeUser) { return userDao.changePassword(changeUser); }
    public void deleteUser(String id) { userDao.deleteUser(id);}
}
