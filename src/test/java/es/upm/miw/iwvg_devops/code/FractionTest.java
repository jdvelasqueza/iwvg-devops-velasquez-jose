package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(3, 4);
    }

    @Test
    void testFractionConstructorWithParameter() {
        assertEquals(3, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testGetNumerator() {
        assertEquals(3, fraction.getNumerator());
    }

    @Test
    void testSetNumerator() {
        fraction.setNumerator(5);
        assertEquals(5, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testSetDenominator() {
        fraction.setDenominator(7);
        assertEquals(7, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.75, fraction.decimal(), 0.001);
    }

    @Test
    void testIsProper() {
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertFalse(fraction.isImproper());
    }

    @Test
    void testEquivalent() {
        assertTrue(fraction.equivalent(new Fraction(6, 8)));
    }

    @Test
    void testAdd() {
        Fraction fractionNew = new Fraction(3, 4);
        this.fraction.add(fractionNew);
        assertEquals(24, this.fraction.getNumerator());
        assertEquals(16, this.fraction.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction fractionNew = new Fraction(3, 4);
        this.fraction.multiply(fractionNew);
        assertEquals(9, this.fraction.getNumerator());
        assertEquals(16, this.fraction.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction fractionNew = new Fraction(3, 4);
        this.fraction.divide(fractionNew);
        assertEquals(12, this.fraction.getNumerator());
        assertEquals(12, this.fraction.getDenominator());
    }

    @Test
    void testToString() {
        assertEquals("Fraction{numerator=3, denominator=4}", fraction.toString());
    }

}
