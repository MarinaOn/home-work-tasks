package com.hillel.lecture_10;

public class CalculatorMain {

    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        System.out.println("The result is " + simpleCalculator.plus(2845,57));
        System.out.println("The result is " + simpleCalculator.minus(28789,901));
        System.out.println("The result is " + simpleCalculator.divide(100500,40));
        System.out.println("The result is " + simpleCalculator.sqrt(16));
        EngineeringCalculator engineeringCalculator = new EngineeringCalculator();
        System.out.println("The result is " + engineeringCalculator.pow(1381, 2));
    }
}