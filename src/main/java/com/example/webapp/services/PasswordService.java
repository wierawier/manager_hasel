package com.example.webapp.services;


import com.example.webapp.models.Password;
import com.example.webapp.repositories.PasswordRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PasswordService {
    private final PasswordRepository passwordRepository;

    public List<Password> listPasswords () {
        return passwordRepository.findAll();
    }

    public Password getPasswordById(Long id) {
         return passwordRepository.findById(id).orElse(null);
    }

    public void addPassword(Password password) {
        log.info("Add new {}", password);
        passwordRepository.save(password);
    }

    public void deletePassword(Long id) {
        passwordRepository.deleteById(id);
    }


}
