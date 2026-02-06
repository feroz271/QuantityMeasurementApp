package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {
    /*
    public static final class Feet {
public static final class Feet {
        private final double value;
        public Feet(double value) {
            this.value = value;
        }
        public double value() {
            return value;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() != obj.getClass()) return false;
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
    }*/
    public static boolean demonstrateLengthEquality(QuantityLength.Length l1, QuantityLength.Length l2) {
        return l1.equals(l2);
    }

    public static QuantityLength.Length demonstrateLengthConversion(
            QuantityLength.Length length,
            QuantityLength.LengthUnit targetUnit) {
        return length.convertTo(targetUnit);
    }

    public static double convert(double value, QuantityLength.LengthUnit from, QuantityLength.LengthUnit to) {
        if (from == null || to == null) {
            throw new IllegalArgumentException("Units cannot be null");
        }
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Value must be finite");
        }
        double inches = from.toInches(value);
        return to.fromInches(inches);
    }

    public static void main(String[] args) {
        QuantityLength.Length feet = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET);
        QuantityLength.Length inches = feet.convertTo(QuantityLength.LengthUnit.INCHES);
        System.out.println(inches);
        System.out.println(convert(3.0, QuantityLength.LengthUnit.YARDS, QuantityLength.LengthUnit.FEET));
    }
}