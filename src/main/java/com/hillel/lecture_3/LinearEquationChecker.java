package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class LinearEquationChecker {

    @Step
    public int linearEquation(int a, int b) {

//        TODO implements result
        int result = 0;

        if(a == 0) {
            return result = 0;
        } else if(b == 0) {
            return result = 0;
        } else {
            return result = -b / a;

        }
    }
}
