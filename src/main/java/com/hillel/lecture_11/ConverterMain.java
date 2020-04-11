package com.hillel.lecture_11;

public class ConverterMain {
    public static void main(String[] args) {

        IConverter value = new CelsiusToFahrenheit();
        value.convert(16);

    }
}
