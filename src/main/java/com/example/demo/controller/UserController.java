package com.example.demo.controller;


import com.example.demo.domain.UserVO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<UserVO> findAllUser() {
        return userService.findAllUser();
    }

    @GetMapping("/search/id")
    public UserVO findById(@RequestParam("id") String id) {
        return userService.findUserById(id);
    }

    @GetMapping("/search/uid")
    public UserVO findUserByUid(@RequestParam("uid") long _uid) {
        return userService.findUserByUid(_uid);
    }

    @PostMapping("/add")
    public void addUser(@RequestBody UserVO newUser) {
        int result =  userService.addUser(newUser);
        System.out.println(result);
    }

    @PutMapping("/changePassword")
    public void changePassword(@RequestBody UserVO changeUser) {
        userService.changePassword(changeUser);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }
}
