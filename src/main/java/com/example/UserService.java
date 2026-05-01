package com.example;

public class UserService {

    private final String username;

    public UserService(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAdmin(String role) {
        return "ADMIN".equals(role);
    }
}