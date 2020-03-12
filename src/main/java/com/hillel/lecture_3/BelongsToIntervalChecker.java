package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class BelongsToIntervalChecker {

    @Step
    public String checkNumberInInterval(int from, int to, int number) {
        String result = "";
        if (from <= number && number <= to) {
            return result = "Number " + number + " belong to interval [" + from + ";" + to + "]";
        } else {
            return result = "Number " + number + " not belong to interval [" + from + ";" + to + "]";
        }

    }
}
