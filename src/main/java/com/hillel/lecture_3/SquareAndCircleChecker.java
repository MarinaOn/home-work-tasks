package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result

        double angle = Math.sqrt(squareArea) / 2;
        double radius = Math.sqrt(circleArea / Math.PI);
        String result = "";

        if (radius <= angle) {
            return result = "The circle is in the square";
        } else {
            return result = "The circle is not in the square";
        }

    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";

        if ((Math.PI * squareArea) < (2 * circleArea)) {
            return result = "The square is in the circle";
        } else {
            return result = "The square is not in the circle";
        }
    }
}
