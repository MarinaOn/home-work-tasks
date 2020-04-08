package com.hillel.lecture_8;

import java.util.Objects;

public class FractionNumbers {

    public int numerator;
    public int denominator;

    FractionNumbers(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public FractionNumbers plus (FractionNumbers add) {
        int resultNumerator = this.numerator * add.denominator + add.numerator * this.denominator;
        int resultDenominator = this.denominator * add.denominator;
        return new FractionNumbers(resultNumerator, resultDenominator);

    }
    public FractionNumbers minus (FractionNumbers subtractor) {
        int resultNumerator = this.numerator * subtractor.denominator - subtractor.numerator * this.denominator;
        int resultDenominator = this.denominator * subtractor.denominator;
        return new FractionNumbers(resultNumerator, resultDenominator);
    }

    public FractionNumbers multiply (FractionNumbers multiplier) {
        int resultNumerator = this.numerator * multiplier.numerator;
        int resultDenominator = this.denominator * multiplier.denominator;
        return new FractionNumbers(resultNumerator, resultDenominator);
    }

    public FractionNumbers divide (FractionNumbers divider) {
        int resultNumerator = this.numerator * divider.denominator ;
        int resultDenominator = this.denominator * divider.numerator;
        return new FractionNumbers(resultNumerator, resultDenominator);
    }
    public String toString() {
        return numerator + "/" + denominator;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumbers that = (FractionNumbers) o;
        return numerator == that.numerator &&
                denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
