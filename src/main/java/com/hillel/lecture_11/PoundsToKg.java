package com.hillel.lecture_11;

public class PoundsToKg implements IConverter {
    @Override
    public double convert(double value) {
        double result = value / poundsCoefficient;
        System.out.println("The result is " + result);
        return result;
    }
}
