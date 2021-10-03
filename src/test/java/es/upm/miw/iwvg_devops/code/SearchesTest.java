package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchesTest {

    @Test
    void testFindFractionMultiplicationByUserFamilyName() {
        assertEquals(new Fraction(1,1),
                new Searches().findFractionMultiplicationByUserFamilyName("Torres"));
    }
}
