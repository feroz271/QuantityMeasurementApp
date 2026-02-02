package com.apps.quantitymeasurement;

/**
 * UC1: Feet measurement equality.
 * Compares two Feet objects using proper equals() implementation.
 */
public class QuantityMeasurementApp {

    // Immutable value object for Feet
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        /**
         * Equals logic:
         * 1) Same reference → true
         * 2) Null → false
         * 3) Different class/type → false
         * 4) Compare double values with Double.compare(...) == 0
         */
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;           // same reference
            if (obj == null) return false;           // null check
            if (getClass() != obj.getClass()) return false; // type check
            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            // Must be consistent with equals
            return Double.hashCode(value);
        }

        @Override
        public String toString() {
            return value + " ft";
        }
    }

    // Optional demo
    public static void main(String[] args) {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);
        Feet f3 = new Feet(2.0);

        System.out.println("f1 == f2 ? " + f1.equals(f2)); // true
        System.out.println("f1 == f3 ? " + f1.equals(f3)); // false
    }
}