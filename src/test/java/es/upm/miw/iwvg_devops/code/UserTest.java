package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;
    List<Fraction> fractions;

    @BeforeEach
    void before() {
       fractions = new ArrayList<>(List.of(
               new Fraction(4, 2),
               new Fraction(3, 5)));
        user = new User("usu001", "usuario1", "familyName", fractions);
    }

    @Test
    void testUserStringStringStringListFraction() {
        assertEquals("usu001",user.getId());
        assertEquals("usuario1",user.getName());
        assertEquals("familyName",user.getFamilyName());
        assertEquals(fractions,user.getFractions());
    }

    @Test
    void testUser() {
        User user1 = new User();
        assertEquals(new ArrayList<>(),user1.getFractions());
    }
}
