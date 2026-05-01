package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserService {

    // 🔴 ISSUE 8: Hardcoded credentials (Critical Security)
    private String dbUrl = "jdbc:mysql://localhost/mydb";
    private String dbUser = "root";
    private String dbPass = "root1234";

    public String username;  // 🔴 ISSUE 9: Public field (encapsulation)

    // 🔴 ISSUE 10: SQL Injection vulnerability
    public void getUser(String userId) throws Exception {
        Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        Statement stmt = conn.createStatement();
        stmt.execute("SELECT * FROM users WHERE id = " + userId); // SQL Injection!
    }

    // 🔴 ISSUE 11: NullPointerException risk
    public int getUsernameLength(String name) {
        return name.length(); // no null check
    }

    // 🔴 ISSUE 12: Duplicate code block
    public void printUser() {
        System.out.println("User: " + username);
        System.out.println("User: " + username);
        System.out.println("User: " + username);
    }
}