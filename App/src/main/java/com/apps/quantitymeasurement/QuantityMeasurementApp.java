package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {
    public static void main(String[] args) {
        QuantityLength.Length length1 = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET);
        QuantityLength.Length length2 = new QuantityLength.Length(12.0, QuantityLength.LengthUnit.INCHES);
        System.out.println(length1.equals(length2));
        QuantityLength.Length length3 = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.YARDS);
        QuantityLength.Length length4 = new QuantityLength.Length(3.0, QuantityLength.LengthUnit.FEET);
        System.out.println(length3.equals(length4));
        QuantityLength.Length length5 = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.CENTIMETERS);
        QuantityLength.Length length6 = new QuantityLength.Length(0.393701, QuantityLength.LengthUnit.INCHES);
        System.out.println(length5.equals(length6));
    }
}