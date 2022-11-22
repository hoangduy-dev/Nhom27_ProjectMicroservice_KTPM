package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserDao;

@Repository
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByEmail(String email);
}