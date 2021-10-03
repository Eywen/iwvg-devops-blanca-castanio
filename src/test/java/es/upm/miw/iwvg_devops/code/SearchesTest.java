package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class SearchesTest {

    @Test
    void testfindUserFamilyNameByAllNegativeSignFractionDistinct() {
        assertEquals(List.of("Blanco", "López"),
                new Searches().findUserFamilyNameByAllNegativeSignFractionDistinct()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFractionMultiplicationByUserFamilyName() {
        assertEquals(new Fraction(1,1),
                new Searches().findFractionMultiplicationByUserFamilyName("Torres"));
    }
}
