package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class Calculator {
    private double a;
    private double b;
    public double adding(double a, double b) {
        return a + b;
    }
    public double substract(double a, double b) {
        return a - b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result1 = calculator.adding(15.4, 7.3);
        double result2 = calculator.substract(72.3, 34.54);

        System.out.println("Result of addition is " + result1);
        System.out.println("Result of substraction is " + result2);
    }
}