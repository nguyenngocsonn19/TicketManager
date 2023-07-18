package com.example.ticketmanager.service;

import com.example.ticketmanager.entity.User;

public interface UserService {
    User findUserByUsername(String username);

    void saveUser(User user);
}