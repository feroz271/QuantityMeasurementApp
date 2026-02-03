package com.apps.quantitymeasurement;

/**
 * UC3: Supported length units with conversion factors to the base unit (INCH).
 * For UC3 we need FEET and INCH. (UC4 me YARD, CENTIMETER add karenge.)
 */
public enum LengthUnit {
    INCH(1.0),   // base
    FEET(12.0);  // 1 ft = 12 in

    private final double toInchesFactor;

    LengthUnit(double toInchesFactor) {
        this.toInchesFactor = toInchesFactor;
    }

    /** Convert a value in this unit to inches (base unit). */
    public double toBaseInches(double value) {
        return value * toInchesFactor;
    }
}