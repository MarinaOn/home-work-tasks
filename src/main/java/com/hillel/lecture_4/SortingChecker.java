package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

//        TODO implements result
        int temp;
        for (int j=0; j<values.length; j++)
            for (int i = 0; i<values.length; i++){
                if (i != values.length - 1 && values[i] > values[i+1]){
                    temp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = temp;
                }
            }
        return values;
    }


    @Step
    public int[] fromMaxToMin(int[] values) {

//        TODO implements result
        int temp;
        for (int j=0; j<values.length; j++)
            for (int i = 0; i<values.length; i++){
                if (i != values.length - 1 && values[i] < values[i+1]){
                    temp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = temp;
                }
            }
        return values;
    }
}
