package com.example.webapp.models;

import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {
    public static final String ALPHABET = "1234657890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*_+";
    public static final Random R = new SecureRandom();

    public PasswordGenerator() {
    }

    public static String makePassword(int length) {
        StringBuilder password = new StringBuilder();

        for(int i = 0; i < length; ++i) {
            password.append("1234657890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*_+".charAt(R.nextInt("1234657890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*_+".length())));
        }

        return password.toString();
    }
}

