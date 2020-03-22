package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class MinValueChecker {

    @Step
    public int getValue(int[] values) {
        int[] data = values;
        int result = 0;

        for (int i = 0; i < data.length; i++) {

            if (result > data[i]) {
                result = data[i];
            }
        } return result;

    }

}
