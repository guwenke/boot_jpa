package com.example.jpademo.service;

import com.example.jpademo.entity.User;

/**
 * ${DESCRIPTION}
 *
 * @author guwenke
 * @date 2019-03-28 14:23
 **/
public interface UserService {
    User findById(Integer id);
}
