package com.example.webapp.repositories;

import com.example.webapp.models.Password;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PasswordRepository extends JpaRepository<Password, Long> {
    List<Password> findByTitle(String title);
}
