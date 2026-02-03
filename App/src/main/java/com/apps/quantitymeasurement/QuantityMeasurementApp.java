package com.apps.quantitymeasurement;

/**
 * UC2: Inches measurement equality (along with UC1: Feet equality).
 * Each unit is its own value type with proper equals/hashCode semantics.
 */
public class QuantityMeasurementApp {

    // ===== UC1: Feet =====
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;                    // same reference
            if (obj == null || getClass() != obj.getClass()) return false; // null or different type
            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }

        @Override
        public String toString() {
            return value + " ft";
        }
    }

    // ===== UC2: Inches =====
    public static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;                    // same reference
            if (obj == null || getClass() != obj.getClass()) return false; // null or different type
            Inches other = (Inches) obj;
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }

        @Override
        public String toString() {
            return value + " in";
        }
    }

    // ---- Optional demo methods like in your brief ----
    public static void demonstrateFeetEquality() {
        Feet a = new Feet(1.0);
        Feet b = new Feet(1.0);
        System.out.println("Feet equality (1.0 vs 1.0): " + a.equals(b)); // true
    }

    public static void demonstrateInchesEquality() {
        Inches a = new Inches(1.0);
        Inches b = new Inches(1.0);
        System.out.println("Inches equality (1.0 vs 1.0): " + a.equals(b)); // true
    }

    public static void main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
    }
}