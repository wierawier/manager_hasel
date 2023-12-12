package com.example.webapp.controller;

import com.example.webapp.models.Password;
import com.example.webapp.models.PasswordInput;
import com.example.webapp.services.PasswordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class IndexController {

    private final PasswordService passwordService;

    public IndexController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @GetMapping("/")
    public String passwords(Model model) {
        List<Password> attributeValue = passwordService.listPasswords();
        model.addAttribute("passwords", attributeValue);
        return "passwords";
    }

    @PostMapping("/password/create")
    public String createPassword(PasswordInput pi) {

        Password p = convert(pi);
        passwordService.addPassword(p);
        return "redirect:/";
    }

    private Password convert(PasswordInput pI) {
        return new Password(null, pI.getTitle(), pI.getSite(), pI.getLogin(), pI.getPassword());
    }

    @PostMapping("/password/delete/{id}")
    public String deletePassword(@PathVariable Long id) {
        passwordService.deletePassword(id);
        return "redirect:/";
    }

    @GetMapping("/password/{id}")
    public String passwordInfo(@PathVariable Long id, Model model) {
        Password passwordById = passwordService.getPasswordById(id);
        model.addAttribute("password", passwordById);
        return "password-info";
    }

}
