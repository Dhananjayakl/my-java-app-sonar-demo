package com.example;

public class Calculator {

    // 🔴 ISSUE 1: Hardcoded password (Security Hotspot)
    private String password = "admin123";

    // 🔴 ISSUE 2: System.out.println (Code Smell)
    public int add(int a, int b) {
        int result = a + b;
        System.out.println("Result: " + result);
        return result;
    }

    // 🔴 ISSUE 3: Integer division loses precision (Bug)
    public double divide(int a, int b) {
        return a / b;  // Should be (double) a / b
    }

    // 🔴 ISSUE 4: Empty catch block (Code Smell)
    public int parseNumber(String value) {
        int result = 0;
        try {
            result = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            // swallowed exception - bad practice
        }
        return result;
    }

    // 🔴 ISSUE 5: == used for String comparison (Bug)
    public boolean checkName(String name) {
        return name == "admin";
    }

    // 🔴 ISSUE 6: Unused local variable (Code Smell)
    public int subtract(int a, int b) {
        int unusedVar = 100;
        return a - b;
    }

    // 🔴 ISSUE 7: Unused private method (Dead Code)
    private void unusedMethod() {
        System.out.println("I am never called");
    }
}