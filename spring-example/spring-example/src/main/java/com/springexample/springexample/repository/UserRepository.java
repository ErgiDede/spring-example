package com.springexample.springexample.repository;

import com.springexample.springexample.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

