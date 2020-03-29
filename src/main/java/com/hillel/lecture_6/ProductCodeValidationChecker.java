package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result
        boolean isValid = false;

        String[] codeArray = code.split(" ");
        int first = parseToInt(codeArray[0],2,6) *
                parseToInt(codeArray[0],7, 10) *
                parseToInt(codeArray[0], 13, 17);

        int second = Integer.parseInt(codeArray[1]);
        if (codeArray[0].equals(codeArray[0].toUpperCase()) && first == second) {isValid = true;}
        return isValid;
    }
    public static int parseToInt (String string, int firstNum, int secondNum) {
        String tempString = Character.toString(string.charAt(firstNum));
        tempString = tempString + string.charAt(secondNum);
        int result = Integer.parseInt(tempString);
        return result;
    }
}
