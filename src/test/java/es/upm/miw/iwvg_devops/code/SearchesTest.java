package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class SearchesTest {

    @Test
    void testFindUserFamilyNameByAllNegativeSignFractionDistinct() {
        assertEquals(List.of("Blanco", "López"),
                new Searches().findUserFamilyNameByAllNegativeSignFractionDistinct()
                .collect(Collectors.toList()));
    }

    @Test
    void TestFindFractionDivisionByUserId(){
        Fraction fractionDiv = new Searches().findFractionDivisionByUserId("4");
        assertEquals(8, fractionDiv.getNumerator());
        assertEquals(8, fractionDiv.getDenominator());
    }

    @Test
    void TestFindFractionAdditionByUserId(){
        Fraction fractionAdd = new Searches().findFractionAdditionByUserId("4");
        assertEquals(24, fractionAdd.getNumerator());
        assertEquals(8, fractionAdd.getDenominator());
    }

    @Test
    void testFindFractionMultiplicationByUserFamilyName() {
        Fraction fractionMultiply = new Searches().findFractionMultiplicationByUserFamilyName("López");
        assertEquals(12, fractionMultiply.getNumerator());
        assertEquals(-240, fractionMultiply.getDenominator());
    }
}
