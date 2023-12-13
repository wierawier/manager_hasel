package com.example.webapp.services;

import com.example.webapp.models.Password;
import com.example.webapp.repositories.PasswordRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PasswordServiceTest {

    @Mock
    private PasswordRepository passwordRepository;
    private PasswordService testee;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        testee = new PasswordService(passwordRepository);
    }

    @Test
    void listPasswordsEmpty() {
        when(passwordRepository.findAll()).thenReturn(List.of());
        List<Password> passwords = testee.listPasswords();
        Assertions.assertNotNull(passwords);
        Assertions.assertEquals(0, passwords.size());
    }

    @Test
    void listPasswordsTwo() {
        when(passwordRepository.findAll()).thenReturn(List.of(
                new Password(1L, "qqqq", "aa@bb.com", "qwer", "asdf"),
                new Password(2L, "qqqq", "aa@bb.com", "qwer", "asdf")
        ));
        List<Password> passwords = testee.listPasswords();
        Assertions.assertNotNull(passwords);
        Assertions.assertEquals(2, passwords.size());
        Assertions.assertEquals("asdf", passwords.get(0).getPassword());
    }

    @Test
    void getPasswordById() {
    }

    @Test
    void addPassword() {
    }

    @Test
    void deletePassword() {
    }
}