package com.example;

public class Calculator {

    // 🔴 ISSUE 1: Password hardcoded (Security Hotspot)
    String password = "admin123";

    // 🔴 ISSUE 2: Method too complex + no null check
    public int add(int a, int b) {
        int result = a + b;
        System.out.println("Result: " + result); // 🔴 ISSUE 3: Avoid System.out
        return result;
    }

    // 🔴 ISSUE 4: Division by zero not handled (Bug)
    public double divide(int a, int b) {
        return a / b;
    }

    // 🔴 ISSUE 5: Empty catch block (Code Smell)
    public void riskyOperation() {
        try {
            int x = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            // doing nothing - BAD
        }
    }

    // 🔴 ISSUE 6: Unused method (Dead code)
    private void unusedMethod() {
        int x = 10;
    }

    // 🔴 ISSUE 7: == used instead of .equals() for String comparison
    public boolean checkName(String name) {
        return name == "admin";
    }
}