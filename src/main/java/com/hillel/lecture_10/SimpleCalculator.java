package com.hillel.lecture_10;

public class SimpleCalculator extends Calculator {


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

    public int sqrt(int a) {
        return (int) Math.sqrt(a);
    }

}
