package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {
    /*public static final class Feet {
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
    public static boolean demonstrateLengthEquality(QuantityLength l1, QuantityLength l2) {
        return l1.equals(l2);
    }
    public static double convert(
            double value,
            LengthUnit sourceUnit,
            LengthUnit targetUnit) {
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Value must be finite");
        }
        if (sourceUnit == null || targetUnit == null) {
            throw new IllegalArgumentException("Units cannot be null");
        }
        double inches = sourceUnit.toInches(value);
        return targetUnit.fromInches(inches);
    }
    public static QuantityLength demonstrateLengthConversion(
            QuantityLength length,
            LengthUnit targetUnit) {
        return length.convertTo(targetUnit);
    }
    public static void main(String[] args) {
           /* Feet a = new Feet(1.0);
            Feet b = new Feet(1.0);
            System.out.println(a.equals(b));*/
            /*QuantityLength length1 = new QuantityLength(1.0, LengthUnit.FEET);
            QuantityLength length2 = new QuantityLength(12.0, LengthUnit.INCHES);
            System.out.println(length1.equals(length2));
            QuantityLength length3 = new QuantityLength(1.0, LengthUnit.YARDS);
            QuantityLength length4 = new QuantityLength(3.0, LengthUnit.FEET);
            System.out.println(length3.equals(length4));
            QuantityLength length5 = new QuantityLength(1.0, LengthUnit.CENTIMETERS);
            QuantityLength length6 = new QuantityLength(0.393701, LengthUnit.INCHES);
            System.out.println(length5.equals(length6));*/
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength inches = feet.convertTo(LengthUnit.INCHES);
        System.out.println(inches);
        System.out.println(convert(3.0, LengthUnit.YARDS, LengthUnit.FEET));
    }
}
