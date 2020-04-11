package com.hillel.lecture_11;

public class CelsiusToKelvin implements IConverter {

    @Override
    public double convert(double value) {
        double result = value + kelvinCoefficient;
        System.out.println("Your result is " + result);
        return result;
    }
}
