package com.spring.restapi.simpleRestApi.repository;

import com.spring.restapi.simpleRestApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
