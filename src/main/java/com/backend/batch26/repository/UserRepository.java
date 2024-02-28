package com.backend.batch26.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.batch26.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
