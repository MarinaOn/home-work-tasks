package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class TriangleChecker {

    @Step
    public String isTriangleIsosceles(int a, int b, int c) {

//        TODO implements result
        String result = "";
        if ((a == b ) || (a == c) || (b == c)) {
            return result = "Isosceles triangle!";

        } else {
            return result = "No isosceles triangle!";
        }
    }
}