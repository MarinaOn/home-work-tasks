package com.hillel.lecture_11;

public class KmToMiles implements IConverter {
    @Override
    public double convert(double value) {
        double result = value / speedCoefficient;
        System.out.println("The result is " + result);
        return result;
    }
}
