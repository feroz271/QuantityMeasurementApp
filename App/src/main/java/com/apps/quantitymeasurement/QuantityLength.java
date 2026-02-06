package com.apps.quantitymeasurement;

import java.util.Objects;

public class QuantityLength {
    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);
        private final double conversionFactor;
        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }
        public double toInches(double value) {
            return value * conversionFactor;
        }
    }

    public static class Length {
        private final double value;
        private final LengthUnit unit;
        public Length(double value, LengthUnit unit) {
            if (unit == null) {
                throw new IllegalArgumentException("Unit cannot be null");
            }
            this.value = value;
            this.unit = unit;
        }
        private double toInches() {
            return unit.toInches(value);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Length other = (Length) obj;
            return Double.compare(this.toInches(), other.toInches()) == 0;
        }
        @Override
        public int hashCode() {
            return Objects.hash(toInches());
        }
        @Override
        public String toString() {
            return value + " " + unit;
        }
    }
}