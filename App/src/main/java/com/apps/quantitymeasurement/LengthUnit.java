package com.apps.quantitymeasurement;

public enum LengthUnit {
    FEET(12.0),
    INCHES(1.0),
    YARDS(36.0),
    CENTIMETERS(0.393701);
    private final double conversionFactorToInches;
    LengthUnit(double conversionFactorToInches) {
        this.conversionFactorToInches = conversionFactorToInches;
    }
    public double toInches(double value) {
        return value * conversionFactorToInches;
    }
    public double fromInches(double inches) {
        return inches / conversionFactorToInches;
    }
}