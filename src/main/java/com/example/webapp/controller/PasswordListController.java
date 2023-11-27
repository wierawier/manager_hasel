package com.example.webapp.controller;

import com.example.webapp.models.Password;
import com.example.webapp.models.PasswordInput;
import com.example.webapp.services.PasswordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class PasswordListController {
    private final PasswordService passwordService;
    @GetMapping("/")
    public String passwords(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("passwords", passwordService.listPasswords(title));
        return "passwords";
    }

    @PostMapping("/password/create")
    public String createPassword(PasswordInput pi){

        Password p = convert(pi);
        passwordService.addPassword(p);
        return "redirect:/";
    }

    private Password convert(PasswordInput pI) {
        return new Password(null, pI.getTitle(), pI.getSite(), pI.getLogin(), pI.getPassword());
    }


    @PostMapping("/password/delete/{id}")
    public String deletePassword(@PathVariable Long id){
        passwordService.deletePassword(id);
        return "redirect:/";
    }

    @GetMapping("/password/{id}")
    public String passwordInfo(@PathVariable Long id, Model model){
        model.addAttribute("password", passwordService.getPasswordById(id));
        return "password-info";
    }
}
