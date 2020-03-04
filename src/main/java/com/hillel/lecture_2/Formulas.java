package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {
        double result = 1.1 * Math.exp(-x) + Math.abs(Math.cos(Math.sqrt(Math.PI * x))) - 3D/8D;
//        TODO implement formula 9
        return result;
    }

    @Step
    public double calculate10Formula(double x) {
        double result = 1D/3D * (Math.sqrt(Math.abs(Math.sin(x)))) * (Math.cbrt(Math.exp(0.12D * x)));
//        TODO implement formula 10
        return result;
    }

    @Step
    public double calculate11Formula(double x) {
        double result = (2D * Math.PI * x) - Math.abs(Math.sin(Math.sqrt(10.5D * x))) * 1D/((Math.cbrt(Math.pow(x, 2)) + 1D/7D));
//        TODO implement formula 11
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        double result = Math.log((Math.sqrt(Math.abs(2D - x)) + 1.2D)) * (1D / (2D + Math.exp(-x))) + Math.cbrt(2D/x);
//        TODO implement formula 12
        return result;
    }

    @Step
    public double calculate13Formula(double x) {
        double result = (Math.pow((Math.exp(-2D + x)), 1.0/5)) * (1D/(Math.sqrt((Math.pow(x, 2D)) + Math.pow(x, 4D) + Math.log(Math.abs(x - 3.14D)))));
//        TODO implement formula 13
        return result;
    }
}
