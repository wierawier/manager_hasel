package com.example.webapp.services;

import com.example.webapp.models.Password;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PasswordService {
    private List<Password> passwords = new ArrayList<>();
    private int ID = 0;

    {
        passwords.add(new Password(++ID,"Youtube", "youtube.com", "xyz@gmail.com", "kjcseiu%72edjc"));
        passwords.add(new Password(++ID,"Twitter", "x.com", "qwerty@gmail.com", "LKcsdckdcn"));
    }

    public Password getPasswordById(Integer id) {
        for (Password password : passwords) {
            if (password.getId() == id)
                return password;
        }
        return null;
    }
    public List<Password> listPassword() {
        return passwords;
    }

    public void addPassword(Password password) {
        password.setId(++ID);
        passwords.add(password);
    }

    public void deletePassword(Integer id) {
        passwords.removeIf(password -> password.getId() == id);
    }


}
