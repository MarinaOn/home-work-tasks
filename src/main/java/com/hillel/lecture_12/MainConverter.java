package com.hillel.lecture_12;

public class MainConverter {

    public static void main(String[] args) throws ConverterCalculationException {

        ConverterFactory converterFactory = new ConverterFactory();
        try {
            IConverter converter = converterFactory.createConverter(ConverterTypes.CELSIUSTOFAHRENHEIT);
            System.out.println(converter.doubleConvert(-10.0));
        } catch (ConverterCalculationException e){
            System.out.println("The value is lower than 0!");
        } catch (MissedConverterExeption exception){
            System.out.println("No such converter");
        }

    }
}
