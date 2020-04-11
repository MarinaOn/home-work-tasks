package com.hillel.lecture_11;

public class MetersToInches implements IConverter {
    @Override
    public double convert(double value) {
        double result = value * inchesCoefficient;
        System.out.println("The result is " + result);
        return result;
    }
}
