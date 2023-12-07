package com.example.practice.repostitory;

import com.example.practice.Entity.User;
import com.example.practice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
