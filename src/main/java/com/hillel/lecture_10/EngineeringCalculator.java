package com.hillel.lecture_10;

public class EngineeringCalculator extends Calculator {

    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    public int sin(int a) {
        return (int) Math.sin(a);
    }

    public int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

}
