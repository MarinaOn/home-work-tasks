package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

//        TODO implements result

        int i = value.length() - 1;
        int j = 0;
        while (i > j) {
            if (value.charAt(i) != value.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }

        return true;

    }
}

