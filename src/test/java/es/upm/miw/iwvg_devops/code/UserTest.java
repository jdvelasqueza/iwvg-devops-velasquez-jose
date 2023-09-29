package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;

    @BeforeEach
    void before() {
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(1, 2));
        fractions.add(new Fraction(3, 4));
        user = new User("1018", "Max", "Ramos", fractions);
    }

    @Test
    void testUser(){
        assertEquals("1018", user.getId());
        assertEquals("Max", user.getName());
        assertEquals("Ramos", user.getFamilyName());
        assertEquals(2, user.getFractions().size());
    }

    @Test
    void testUserConstructorWithParameter(){
        assertEquals("1018", user.getId());
        assertEquals("Max", user.getName());
        assertEquals("Ramos", user.getFamilyName());
        List<Fraction> fractions = user.getFractions();
        assertEquals(2, fractions.size());
        assertEquals(1, fractions.get(0).getNumerator());
        assertEquals(2, fractions.get(0).getDenominator());
        assertEquals(3, fractions.get(1).getNumerator());
        assertEquals(4, fractions.get(1).getDenominator());
    }

    @Test
    void testGetId(){
        assertEquals("1018", user.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Max", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("David");
        assertEquals("David", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Ramos", user.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("Velasquez");
        assertEquals("Velasquez", user.getFamilyName());
    }

    @Test
    void testGetFractions() {
        List<Fraction> fractions = user.getFractions();
        assertEquals(2, fractions.size());
        assertEquals(1, fractions.get(0).getNumerator());
        assertEquals(2, fractions.get(0).getDenominator());
        assertEquals(3, fractions.get(1).getNumerator());
        assertEquals(4, fractions.get(1).getDenominator());
    }

    @Test
    void testSetFractions() {
        List<Fraction> newFractions = new ArrayList<>();
        newFractions.add(new Fraction(5, 6));
        user.setFractions(newFractions);
        List<Fraction> fractions = user.getFractions();
        assertEquals(1, fractions.size());
        assertEquals(5, fractions.get(0).getNumerator());
        assertEquals(6, fractions.get(0).getDenominator());
    }

    @Test
    void testAddFraction() {
        user.addFraction(new Fraction(5, 6));
        List<Fraction> fractions = user.getFractions();
        assertEquals(3, fractions.size());
        assertEquals(5, fractions.get(2).getNumerator());
        assertEquals(6, fractions.get(2).getDenominator());
    }

    @Test
    void testFullName() {
        assertEquals("Max Ramos", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("M.", user.initials());
    }

    @Test
    void testToString() {
        String expectedToString = "User{id='1018', name='Max', familyName='Ramos', " +
                "fractions=[Fraction{numerator=1, denominator=2}, Fraction{numerator=3, denominator=4}]}";
        assertEquals(expectedToString, user.toString());
    }

}
