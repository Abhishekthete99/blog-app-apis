package com.abhishek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
