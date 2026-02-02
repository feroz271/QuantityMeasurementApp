package com.apps.quantitymeasurementtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Inches;

public class QuantityMeasurementAppTest {

    // ===== UC1: Feet tests =====
    @Test
    public void testFeetEquality_SameValue() {
        Feet a = new Feet(1.0);
        Feet b = new Feet(1.0);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        Feet a = new Feet(1.0);
        Feet b = new Feet(2.0);
        assertFalse(a.equals(b));
    }

    @Test
    public void testFeetEquality_NullComparison() {
        Feet a = new Feet(1.0);
        assertFalse(a.equals(null));
    }

    @Test
    public void testFeetEquality_DifferentClass() {
        Feet a = new Feet(1.0);
        assertFalse(a.equals("1.0"));
    }

    @Test
    public void testFeetEquality_SameReference() {
        Feet a = new Feet(1.0);
        assertTrue(a.equals(a));
    }

    // ===== UC2: Inches tests (mirrors Feet tests) =====
    @Test
    public void testInchesEquality_SameValue() {
        Inches a = new Inches(1.0);
        Inches b = new Inches(1.0);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testInchesEquality_DifferentValue() {
        Inches a = new Inches(1.0);
        Inches b = new Inches(2.0);
        assertFalse(a.equals(b));
    }

    @Test
    public void testInchesEquality_NullComparison() {
        Inches a = new Inches(1.0);
        assertFalse(a.equals(null));
    }

    @Test
    public void testInchesEquality_DifferentClass() {
        Inches a = new Inches(1.0);
        assertFalse(a.equals("1.0"));
    }

    @Test
    public void testInchesEquality_SameReference() {
        Inches a = new Inches(1.0);
        assertTrue(a.equals(a));
    }
}