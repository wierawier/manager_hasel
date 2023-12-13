package com.example.webapp.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {
    @Test
    void makePassword() {
        String s = PasswordGenerator.makePassword(15);
        Assertions.assertEquals(15, s.length());
    }

}