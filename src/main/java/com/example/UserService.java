package com.example;

public class UserService {

    // 🔴 ISSUE 8: Public field instead of private with getter (Code Smell)
    public String username;

    // 🔴 ISSUE 9: No null check before .equals() - NullPointerException risk
    public boolean isAdmin(String role) {
        return role.equals("ADMIN");  // throws NPE if role is null
    }

    // 🔴 ISSUE 10: Return null instead of Optional (Code Smell)
    public String findUser(String name) {
        if (name.isEmpty()) {
            return null;
        }
        return name;
    }

    // 🔴 ISSUE 11: Duplicate code / repeated logic
    public void printUserInfo() {
        System.out.println("User: " + username);
        System.out.println("User: " + username);
        System.out.println("User: " + username);
    }

    // 🔴 ISSUE 12: Too many System.out instead of logger
    public void createUser(String name) {
        System.out.println("Creating user...");
        this.username = name;
        System.out.println("User created: " + name);
    }

    // 🔴 ISSUE 13: Cognitive complexity — deeply nested if blocks
    public String getUserStatus(String role, boolean active, boolean verified) {
        if (role != null) {
            if (active) {
                if (verified) {
                    if (role.equals("ADMIN")) {
                        return "Active Admin";
                    } else {
                        return "Active User";
                    }
                } else {
                    return "Unverified";
                }
            } else {
                return "Inactive";
            }
        }
        return "Unknown";
    }
}