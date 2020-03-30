package com.hillel.lecture_4;

import io.qameta.allure.Step;

import java.util.Arrays;

import static java.lang.Math.pow;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

//        TODO implements result
        int result = 0;
        int powerNum = 0;
        int temp;
        while (value != 0) {
            temp = value % 2;
            result = result + temp * (int) Math.pow(10, powerNum);
            powerNum++;
            value = dividedByNumber (value,2);
        }
        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

        int result = 0;
        int powerNum = 0;
        while (value > 0) {
            if (value % 2 != 0) {result = result + (int) Math.pow(2, powerNum);}
            powerNum++;
            value = dividedByNumber (value,10);
        }
        return result;
    }

    public static int dividedByNumber (int value, int number) {
        int result =  value/number;
        return result;
    }
}
