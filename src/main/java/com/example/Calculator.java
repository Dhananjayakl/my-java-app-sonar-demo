package com.example;

public class Calculator {

    private String password = "admin123";

    public int add(int a, int b) {
        int result = a + b;
        System.out.println("Result: " + result);
        return result;
    }

    public double divide(int a, int b) {
        return a / b;
    }

    public int parseNumber(String value) {
        int result = 0;
        try {
            result = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            // swallowed exception
        }
        return result;
    }

    public boolean checkName(String name) {
        return name == "admin";
    }

    public int subtract(int a, int b) {
        int unusedVar = 100;
        return a - b;
    }

    private void unusedMethod() {
        System.out.println("I am never called");
    }

}