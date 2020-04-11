package com.hillel.lecture_11;

public class KgToPounds implements IConverter {
    @Override
    public double convert(double value) {
        double result = value * poundsCoefficient;
        System.out.println("The result is " + result);
        return result;
    }
}
