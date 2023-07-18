package com.example.ticketmanager.dao;

import com.example.ticketmanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}