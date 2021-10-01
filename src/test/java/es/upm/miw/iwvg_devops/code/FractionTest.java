package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest   {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction (8,4);
    }

    @Test
    void testIntInt(){
        assertEquals(8,fraction.getNumerator());
        assertEquals(4,fraction.getDenominator());
    }

    @Test
    void testDecimal(){
        assertEquals(2,fraction.decimal());
    }
}
