package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class NumberInWordChecker {

    @Step
    public String getNumberIfElse(int number) {
        //        TODO implements result
        String result = "";


        if (number == 1) {
            return result = "ONE";
        } else if (number == 2) {
            return result = "TWO";
        } else if (number == 3) {
            return result = "THREE";
        }  else if (number == 4) {
            return result = "FOUR";
        } else if (number == 5) {
            return result = "FIVE";
        } else if (number == 6) {
            return result = "SIX";
        } else if (number == 7) {
            return result = "SEVEN";
        } else if (number == 8) {
            return result = "EIGHT";
        } else if (number == 9) {
            return result = "NINE";
        } else {
            return result = "OTHER";
        }

    }

    @Step
    public String getNumberSwitchCase(int number) {
        //        TODO implements result
        String result = "";

        switch (number) {
            case 1:
                return result = "ONE";
            case 2:
                return result = "TWO";
            case 3:
                return result =  "THREE";
            case 4:
                return result = "FOUR";
            case 5:
                return result = "FIVE";
            case 6:
                return result = "SIX";
            case 7:
                return result = "SEVEN";
            case 8:
                return result = "EIGHT";
            case 9:
                return result = "NINE";
            default:
                return result = "OTHER";
        }

    }
}
