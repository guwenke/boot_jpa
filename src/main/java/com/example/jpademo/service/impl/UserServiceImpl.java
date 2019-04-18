package com.example.jpademo.service.impl;

import com.example.jpademo.entity.User;
import com.example.jpademo.repository.UserRepository;
import com.example.jpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * ${DESCRIPTION}
 *
 * @author guwenke
 * @date 2019-03-28 14:25
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        return userRepository.getOne(id);
    }
}
