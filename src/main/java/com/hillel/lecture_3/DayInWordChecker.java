package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DayInWordChecker {

    @Step
    public String getDayIfElse(int number) {
        //        TODO implements result
        String result = "";

        if (number == 1) {
            return result = "Monday";
        } else if (number == 2) {
            return result = "Tuesday";
        } else if (number == 3) {
            return result = "Wednesday";
        }  else if (number == 4) {
            return result = "Thursday";
        } else if (number == 5) {
            return result = "Friday";
        } else if (number == 6) {
            return result = "Saturday";
        } else if (number == 7) {
            return result = "Sunday";
        } else {
            return result = "Not a valid day";
        }

    }

    @Step
    public String getDaySwitchCase(int number) {
        //        TODO implements result
        String result = "";

        switch (number) {
            case 1:
                return result = "Monday";
            case 2:
                return result = "Tuesday";
            case 3:
                return result =  "Wednesday";
            case 4:
                return result = "Thursday";
            case 5:
                return result = "Friday";
            case 6:
                return result = "Saturday";
            case 7:
                return result = "Sunday";
            default:
                return result = "Not a valid day";
        }

    }
}
