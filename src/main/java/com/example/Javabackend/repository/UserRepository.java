// src/main/java/com/example/Javabackend/repository/UserRepository.java
package com.example.Javabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Javabackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    User findByUsername(String username);
}
