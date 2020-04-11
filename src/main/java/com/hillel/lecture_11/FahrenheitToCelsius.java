package com.hillel.lecture_11;

public class FahrenheitToCelsius implements IConverter {

    @Override
    public double convert(double value) {
        double result = (value - 32) * 5/9;
        System.out.println("The result is " + result);
        return result;
    }
}
