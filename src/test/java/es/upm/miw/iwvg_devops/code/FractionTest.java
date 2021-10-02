package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(8, 4);
    }

    @Test
    void testIntInt() {
        assertEquals(8, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(2, fraction.decimal());
    }

    @Test
    void testIsProper() {
        assertFalse(fraction.isProper());
    }

    @Test
    void testImproper() {
        assertTrue(fraction.isImproper());
    }

    @Test
    void testAdd() {
        fraction.add(new Fraction(12, 6));
        assertEquals(96, fraction.getNumerator());
        assertEquals(24, fraction.getDenominator());
    }

    @Test
    void testMultiply() {
        fraction.multiply(new Fraction(12, 6));
        assertEquals(96, fraction.getNumerator());
        assertEquals(24, fraction.getDenominator());
    }

    @Test
    void testDivide() {
        fraction.divide(new Fraction(12, 5));
        assertEquals(40, fraction.getNumerator());
        assertEquals(48, fraction.getDenominator());
    }
}
