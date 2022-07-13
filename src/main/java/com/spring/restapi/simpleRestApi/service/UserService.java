package com.spring.restapi.simpleRestApi.service;

import com.spring.restapi.simpleRestApi.model.User;

import java.util.List;

public interface UserService {

    User register(User user);

    List<User> getAll();

    User findByUsername(String username);

    User findById(Long id);

    void delete(Long id);
}
