package com.apps.quantitymeasurementtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityLength;
import com.apps.quantitymeasurement.QuantityMeasurementApp;

public class QuantityMeasurementAppTest {
    //    // ===== UC1: Feet tests using Length =====
//    @Test
//    public void testFeetEquality_SameValue() {
//        QuantityLength.Length a = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET);
//        QuantityLength.Length b = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET);
//        assertTrue(a.equals(b));
//        assertEquals(a.hashCode(), b.hashCode());
//    }
//
//    @Test
//    public void testFeetEquality_DifferentValue() {
//        QuantityLength.Length a = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET);
//        QuantityLength.Length b = new QuantityLength.Length(2.0, QuantityLength.LengthUnit.FEET);
//        assertFalse(a.equals(b));
//    }
//
//    @Test
//    public void testFeetEquality_NullComparison() {
//        QuantityLength.Length a = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET);
//        assertFalse(a.equals(null));
//    }
//
//    @Test
//    public void testFeetEquality_DifferentClass() {
//        QuantityLength.Length a = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET);
//        assertFalse(a.equals("1.0"));
//    }
//
//    @Test
//    public void testFeetEquality_SameReference() {
//        QuantityLength.Length a = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET);
//        assertTrue(a.equals(a));
//    }
//
//    // ===== UC2: Inches tests (mirrors Feet tests) =====
//    @Test
//    public void testInchesEquality_SameValue() {
//        QuantityLength.Length a = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.INCHES);
//        QuantityLength.Length b = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.INCHES);
//        assertTrue(a.equals(b));
//        assertEquals(a.hashCode(), b.hashCode());
//    }
//
//    @Test
//    public void testInchesEquality_DifferentValue() {
//        QuantityLength.Length a = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.INCHES);
//        QuantityLength.Length b = new QuantityLength.Length(2.0, QuantityLength.LengthUnit.INCHES);
//        assertFalse(a.equals(b));
//    }
//
//    @Test
//    public void testInchesEquality_NullComparison() {
//        QuantityLength.Length a = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.INCHES);
//        assertFalse(a.equals(null));
//    }
//
//    @Test
//    public void testInchesEquality_DifferentClass() {
//        QuantityLength.Length a = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.INCHES);
//        assertFalse(a.equals("1.0"));
//    }
//
//    @Test
//    public void testInchesEquality_SameReference() {
//        QuantityLength.Length a = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.INCHES);
//        assertTrue(a.equals(a));
//    }
//
//    // === UC3: Same-unit equality ===
//    @Test
//    void testEquality_FeetToFeet_SameValue() {
//        assertEquals(
//                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET),
//                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET)
//        );
//    }
//
//    @Test
//    void testEquality_InchToInch_SameValue() {
//        assertEquals(
//                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.INCHES),
//                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.INCHES)
//        );
//    }
//
//    // === UC3: Cross-unit equality (feet <-> inch) ===
//    @Test
//    void testEquality_InchToFeet_EquivalentValue() {
//        assertEquals(
//                new QuantityLength.Length(12.0, QuantityLength.LengthUnit.INCHES),
//                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET)
//        );
//    }
//
//    @Test
//    void testEquality_FeetToInch_EquivalentValue() {
//        assertEquals(
//                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET),
//                new QuantityLength.Length(12.0, QuantityLength.LengthUnit.INCHES)
//        );
//    }
//
//    // === UC3: Non-equality ===
//    @Test
//    void testEquality_FeetToFeet_DifferentValue() {
//        assertNotEquals(
//                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET),
//                new QuantityLength.Length(2.0, QuantityLength.LengthUnit.FEET)
//        );
//    }
//
//    @Test
//    void testEquality_InchToInch_DifferentValue() {
//        assertNotEquals(
//                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.INCHES),
//                new QuantityLength.Length(2.0, QuantityLength.LengthUnit.INCHES)
//        );
//    }
//
//    // === UC3: Null & same reference ===
//    @Test
//    void testEquality_NullComparison() {
//        assertNotEquals(new QuantityLength.Length(1.0, QuantityLength.LengthUnit.INCHES), null);
//    }
//
//    @Test
//    void testEquality_SameReference() {
//        var q = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET);
//        assertEquals(q, q);
//    }

    // === UC4: Null, same unit equality,same value & same reference ===


    // === UC5: Conversion tests ===

    private static final double EPSILON = 1e-6;
    @Test
    void testConversion_FeetToInches() {
        double result = QuantityMeasurementApp.convert(
                1.0, QuantityLength.LengthUnit.FEET, QuantityLength.LengthUnit.INCHES);
        assertEquals(12.0, result, EPSILON);
    }
    @Test
    void testConversion_InchesToFeet() {
        double result = QuantityMeasurementApp.convert(
                24.0, QuantityLength.LengthUnit.INCHES, QuantityLength.LengthUnit.FEET);
        assertEquals(2.0, result, EPSILON);
    }
    @Test
    void testConversion_YardsToInches() {
        double result = QuantityMeasurementApp.convert(
                1.0, QuantityLength.LengthUnit.YARDS, QuantityLength.LengthUnit.INCHES);
        assertEquals(36.0, result, EPSILON);
    }
    @Test
    void testConversion_InchesToYards() {
        double result = QuantityMeasurementApp.convert(
                72.0, QuantityLength.LengthUnit.INCHES, QuantityLength.LengthUnit.YARDS);
        assertEquals(2.0, result, EPSILON);
    }
    @Test
    void testConversion_CentimetersToInches() {
        double result = QuantityMeasurementApp.convert(
                2.54, QuantityLength.LengthUnit.CENTIMETERS, QuantityLength.LengthUnit.INCHES);
        assertEquals(1.0, result, EPSILON);
    }
    @Test
    void testConversion_FeetToYards() {
        double result = QuantityMeasurementApp.convert(
                6.0, QuantityLength.LengthUnit.FEET, QuantityLength.LengthUnit.YARDS);
        assertEquals(2.0, result, EPSILON);
    }
    @Test
    void testConversion_RoundTrip_PreservesValue() {
        double original = 5.0;
        double inches = QuantityMeasurementApp.convert(
                original, QuantityLength.LengthUnit.FEET, QuantityLength.LengthUnit.INCHES);
        double feetBack = QuantityMeasurementApp.convert(
                inches, QuantityLength.LengthUnit.INCHES, QuantityLength.LengthUnit.FEET);
        assertEquals(original, feetBack, EPSILON);
    }
    @Test
    void testConversion_ZeroValue() {
        double result = QuantityMeasurementApp.convert(
                0.0, QuantityLength.LengthUnit.FEET, QuantityLength.LengthUnit.INCHES);
        assertEquals(0.0, result, EPSILON);
    }
    @Test
    void testConversion_NegativeValue() {
        double result = QuantityMeasurementApp.convert(
                -1.0, QuantityLength.LengthUnit.FEET, QuantityLength.LengthUnit.INCHES);
        assertEquals(-12.0, result, EPSILON);
    }
    @Test
    void testConversion_InvalidUnit_Throws() {
        assertThrows(
                IllegalArgumentException.class,
                () -> QuantityMeasurementApp.convert(
                        1.0, null, QuantityLength.LengthUnit.FEET)
        );
    }
    @Test
    void testConversion_NaNOrInfinite_Throws() {
        assertThrows(
                IllegalArgumentException.class,
                () -> QuantityMeasurementApp.convert(
                        Double.NaN, QuantityLength.LengthUnit.FEET, QuantityLength.LengthUnit.INCHES)
        );
        assertThrows(
                IllegalArgumentException.class,
                () -> QuantityMeasurementApp.convert(
                        Double.POSITIVE_INFINITY,
                        QuantityLength.LengthUnit.FEET,
                        QuantityLength.LengthUnit.INCHES)
        );
    }
    @Test
    void testConversion_PrecisionTolerance() {
        double result = QuantityMeasurementApp.convert(
                1.0, QuantityLength.LengthUnit.CENTIMETERS, QuantityLength.LengthUnit.INCHES);
        assertEquals(0.393701, result, EPSILON);
    }


}