package com.hillel.lecture_12;

public class ConverterFactory {


    public IConverter createConverter (ConverterTypes type) throws MissedConverterExeption {
        IConverter converter = null;

        switch (type) {
            case CELSIUSTOFAHRENHEIT:
                converter = new CelsiusToFahrenheit();
                break;
            case CELSIUSTOKELVIN:
                converter = new CelsiusToKelvin();
                break;
            case FAHRENHEITTOCELSIUS:
                converter = new FahrenheitToCelsius();
                break;
            case INCHESTOMETERS:
                converter = new InchesToMeters();
                break;
            case KILOGRAMSTOPOUNDS:
                converter = new KilogramsToPounds();
                break;
            case KILOMETRESTOMILES:
                converter = new KilometresToMiles();
                break;
            case METERSTOOINCHES:
                converter = new MetersToInches();
                break;
            case MILESTOKILOMETRES:
                converter = new MilesToKilometres();
                break;
            case POUNDSTOKILOGRAMS:
                converter = new PoundsToKilograms();
                break;
            case SPEEDKMTOMI:
                converter = new SpeedKmToMi();
                break;
            case SPEEDMITOKM:
                converter = new SpeedMiToKm();
                break;
            default: throw new MissedConverterExeption("No such converter!");
        }
        return converter;
    }
}
