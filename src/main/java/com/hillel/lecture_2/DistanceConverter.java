package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter {

    public static final double COEFFICIENT_METERS_INCHES = 39.37;
    public static final double COEFFICIENT_MILES_KILOMETERS = 1.609;

    @Step
    public double metersToInches(double meters) {
        double result = meters * COEFFICIENT_METERS_INCHES;
        return result;
    }

    @Step
    public double inchesToMeters(double inches) {

        double result = inches / COEFFICIENT_METERS_INCHES;
        return result;
    }

    @Step
    public double milesToKilometres(double miles) {
//        TODO implements result
        double result = miles * COEFFICIENT_MILES_KILOMETERS;
        return result;
    }

    @Step
    public double kilometresToMiles(double kilometres) {
//        TODO implements result
        double result = kilometres / COEFFICIENT_MILES_KILOMETERS;
        return result;
    }
}
