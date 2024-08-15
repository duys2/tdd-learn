package com.example.tdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tdd.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}