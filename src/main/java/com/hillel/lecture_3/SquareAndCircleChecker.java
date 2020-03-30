package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

        return getResult(circleArea, squareArea);
    }

    public static String getResult(double circleArea, double squareArea){
        double back = Math.sqrt(squareArea)/2;
        double radius = Math.sqrt(circleArea/Math.PI);
        String result = "";
        if (radius <= back) {
            result = ("The circle is in the square");
        } else {
            result = ("The circle is not in the square");
        }

        return result;
    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        return getRes(circleArea, squareArea);
    }
    public static String getRes(double circleArea, double squareArea){
        double diagonal = Math.sqrt(2*squareArea);
        double D = 2*Math.sqrt(circleArea/Math.PI);
        String result = "";
        if (diagonal <= D) {
            result = ("The square is in the circle");
        } else {
            result = ("The square is not in the circle");
        }
        return result;
    }

}
