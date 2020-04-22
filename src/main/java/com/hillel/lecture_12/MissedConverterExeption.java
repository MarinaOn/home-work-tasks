package com.hillel.lecture_12;

public class MissedConverterExeption extends Exception {
        String message;

    public MissedConverterExeption (String message) {
            this.message = message;
        }
    }
