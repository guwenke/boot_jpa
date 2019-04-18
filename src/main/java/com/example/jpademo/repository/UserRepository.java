package com.example.jpademo.repository;

import com.example.jpademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ${DESCRIPTION}
 *
 * @author guwenke
 * @date 2019-03-28 14:18
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
