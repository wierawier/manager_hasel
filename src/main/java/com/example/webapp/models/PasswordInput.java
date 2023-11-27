package com.example.webapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasswordInput {
    private String title;
    private String site;
    private String login;
    private String password;
}
