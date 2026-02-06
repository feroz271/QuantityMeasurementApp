package com.apps.quantitymeasurementtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityLength;

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
    @Test
    void testEquality_YardToYard_SameValue() {
        assertEquals(
                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.YARDS),
                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.YARDS)
        );
    }
    @Test
    void testEquality_YardToYard_DifferentValue() {
        assertNotEquals(
                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.YARDS),
                new QuantityLength.Length(2.0, QuantityLength.LengthUnit.YARDS)
        );
    }
    @Test
    void testEquality_YardToFeet_EquivalentValue() {
        assertEquals(
                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.YARDS),
                new QuantityLength.Length(3.0, QuantityLength.LengthUnit.FEET)
        );
    }
    @Test
    void testEquality_FeetToYard_EquivalentValue() {
        assertEquals(
                new QuantityLength.Length(3.0, QuantityLength.LengthUnit.FEET),
                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.YARDS)
        );
    }
    @Test
    void testEquality_YardToInches_EquivalentValue() {
        assertEquals(
                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.YARDS),
                new QuantityLength.Length(36.0, QuantityLength.LengthUnit.INCHES)
        );
    }
    @Test
    void testEquality_InchesToYard_EquivalentValue() {
        assertEquals(
                new QuantityLength.Length(36.0, QuantityLength.LengthUnit.INCHES),
                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.YARDS)
        );
    }
    @Test
    void testEquality_YardToFeet_NonEquivalentValue() {
        assertNotEquals(
                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.YARDS),
                new QuantityLength.Length(2.0, QuantityLength.LengthUnit.FEET)
        );
    }
    @Test
    void testEquality_CentimetersToInches_EquivalentValue() {
        assertEquals(
                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.CENTIMETERS),
                new QuantityLength.Length(0.393701, QuantityLength.LengthUnit.INCHES)
        );
    }
    @Test
    void testEquality_CentimetersToFeet_NonEquivalentValue() {
        assertNotEquals(
                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.CENTIMETERS),
                new QuantityLength.Length(1.0, QuantityLength.LengthUnit.FEET)
        );
    }
    @Test
    void testEquality_MultiUnit_TransitiveProperty() {
        QuantityLength.Length yard = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.YARDS);
        QuantityLength.Length feet = new QuantityLength.Length(3.0, QuantityLength.LengthUnit.FEET);
        QuantityLength.Length inches = new QuantityLength.Length(36.0, QuantityLength.LengthUnit.INCHES);
        assertEquals(yard, feet);
        assertEquals(feet, inches);
        assertEquals(yard, inches);
    }
    @Test
    void testEquality_YardWithNullUnit() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityLength.Length(1.0, null)
        );
    }
    @Test
    void testEquality_YardSameReference() {
        QuantityLength.Length yard = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.YARDS);
        assertEquals(yard, yard);
    }
    @Test
    void testEquality_YardNullComparison() {
        QuantityLength.Length yard = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.YARDS);
        assertNotEquals(null, yard);
    }
    @Test
    void testEquality_CentimetersWithNullUnit() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityLength.Length(1.0, null)
        );
    }
    @Test
    void testEquality_CentimetersSameReference() {
        QuantityLength.Length cm = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.CENTIMETERS);
        assertEquals(cm, cm);
    }
    @Test
    void testEquality_CentimetersNullComparison() {
        QuantityLength.Length cm = new QuantityLength.Length(1.0, QuantityLength.LengthUnit.CENTIMETERS);
        assertNotEquals(null, cm);
    }
    @Test
    void testEquality_AllUnits_ComplexScenario() {
        QuantityLength.Length yards = new QuantityLength.Length(2.0, QuantityLength.LengthUnit.YARDS);
        QuantityLength.Length feet = new QuantityLength.Length(6.0, QuantityLength.LengthUnit.FEET);
        QuantityLength.Length inches = new QuantityLength.Length(72.0, QuantityLength.LengthUnit.INCHES);
        assertEquals(yards, feet);
        assertEquals(feet, inches);
        assertEquals(yards, inches);
    }

}