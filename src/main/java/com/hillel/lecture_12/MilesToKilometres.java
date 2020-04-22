package com.hillel.lecture_12;

public class MilesToKilometres implements IConverter{

    @Override
    public double doubleConvert(double value) throws ConverterCalculationException {
        if(value < 0)   {
            throw new ConverterCalculationException("The value is lower than 0!");
        }
        return value * 1.609;
    }
}
