package com.example.bid.repository;

import com.example.bid.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepsitory extends JpaRepository<User,Long> {
}
