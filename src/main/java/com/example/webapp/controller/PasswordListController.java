package com.example.webapp.controller;

import com.example.webapp.models.Password;
import com.example.webapp.services.PasswordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class PasswordListController {
    private final PasswordService passwordService;


    @GetMapping("/")
    public String passwords(Model model) {
        model.addAttribute("passwords", passwordService.listPassword());
        return "passwords";
    }

    @PostMapping("/password/create")
    public String createPassword(String title, String site, String login, String password){
        Password p = new Password(title, site, login, password);
        passwordService.addPassword(p);
        return "redirect:/";
    }

    @PostMapping("/password/delete/{id}")
    public String deletePassword(@PathVariable Integer id){
        passwordService.deletePassword(id);
        return "redirect:/";
    }

    @GetMapping("/password/{id}")
    public String passwordInfo(@PathVariable Integer id, Model model){
        Password passwordById = passwordService.getPasswordById(id);
        //
        model.addAttribute("password", passwordById);
        return "password-info";
    }
}
