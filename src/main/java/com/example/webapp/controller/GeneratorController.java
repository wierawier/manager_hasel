package com.example.webapp.controller;


import com.example.webapp.dto.SomeDto;
import com.example.webapp.models.PasswordGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GeneratorController {

    @GetMapping("/generate")
    public SomeDto generate() {
        String generatedPassword = PasswordGenerator.makePassword(10);
        return new SomeDto(generatedPassword);
    }
}
