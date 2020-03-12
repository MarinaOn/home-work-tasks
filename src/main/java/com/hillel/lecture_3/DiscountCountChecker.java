package com.hillel.lecture_3;

import com.sun.deploy.security.SelectableSecurityManager;
import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DiscountCountChecker {

    @Step
    public double checkDiscountCount(double price) {

//        TODO implements result
        double result = 0.0;

        if (price > 1000D) {
            return result = (price - (price * 0.15D));
        } else {
            return result = 0.0D;
        }


    }
}
