package com.apps.quantitymeasurementtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;

public class QuantityMeasurementAppTest {

    // 1) Same values → equal
    @Test
    public void testFeetEquality_SameValue() {
        Feet a = new Feet(1.0);
        Feet b = new Feet(1.0);
        assertTrue(a.equals(b), "Feet with same numeric value must be equal");
        assertEquals(a.hashCode(), b.hashCode(), "Equal objects must have equal hashCodes");
    }

    // 2) Different values → not equal
    @Test
    public void testFeetEquality_DifferentValue() {
        Feet a = new Feet(1.0);
        Feet b = new Feet(2.0);
        assertFalse(a.equals(b), "Feet with different numeric values must not be equal");
    }

    // 3) Null comparison → false
    @Test
    public void testFeetEquality_NullComparison() {
        Feet a = new Feet(1.0);
        assertFalse(a.equals(null), "Comparison with null must return false");
    }

    // 4) Different class → false
    @Test
    public void testFeetEquality_DifferentClass() {
        Feet a = new Feet(1.0);
        assertFalse(a.equals("1.0"), "Comparison with different type must return false");
    }

    // 5) Same reference → true
    @Test
    public void testFeetEquality_SameReference() {
        Feet a = new Feet(1.0);
        Feet same = a;
        assertTrue(a.equals(same), "Object must be equal to itself (reflexive)");
    }
}