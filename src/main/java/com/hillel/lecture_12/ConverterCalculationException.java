package com.hillel.lecture_12;

public class ConverterCalculationException extends Exception {
    String message;

    public ConverterCalculationException(String message) {
        this.message = message;
    }
}
