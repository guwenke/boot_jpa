package com.example.jpademo.controller;

import com.example.jpademo.entity.User;
import com.example.jpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author guwenke
 * @date 2019-03-28 14:35
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/find/{id}")
    public User findById(@PathVariable Integer id){
        return userService.findById(id);
    }
}
