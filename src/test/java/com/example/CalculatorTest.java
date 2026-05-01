package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testParseValidNumber() {
        assertEquals(42, calculator.parseNumber("42"));
    }

    @Test
    public void testParseInvalidNumber() {
        // buggy code swallows exception and returns 0
        assertEquals(0, calculator.parseNumber("abc"));
    }

    @Test
    public void testDivide() {
        // buggy code does integer division, so 7/2 = 3.0 not 3.5
        assertEquals(3.0, calculator.divide(7, 2), 0.0);
    }
}package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testParseValidNumber() {
        assertEquals(42, calculator.parseNumber("42"));
    }

    @Test
    public void testParseInvalidNumber() {
        // buggy code swallows exception and returns 0
        assertEquals(0, calculator.parseNumber("abc"));
    }

    @Test
    public void testDivide() {
        // buggy code does integer division, so 7/2 = 3.0 not 3.5
        assertEquals(3.0, calculator.divide(7, 2), 0.0);
    }
}package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testParseValidNumber() {
        assertEquals(42, calculator.parseNumber("42"));
    }

    @Test
    public void testParseInvalidNumber() {
        // buggy code swallows exception and returns 0
        assertEquals(0, calculator.parseNumber("abc"));
    }

    @Test
    public void testDivide() {
        // buggy code does integer division, so 7/2 = 3.0 not 3.5
        assertEquals(3.0, calculator.divide(7, 2), 0.0);
    }
}