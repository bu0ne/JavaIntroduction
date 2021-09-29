package pl.wojtczak.lesson3.homework.Others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PythagoreanTheoryTest {

    @Test
    void IsItNotRectangular() {
        //GIVEN
        double sideLengthA = 3;
        double sideLengthB = 3;
        double sideLengthC = 3;
        //WHEN
        boolean resault = PythagoreanTheory.isItTheory(sideLengthA, sideLengthB, sideLengthC);
        //THEN
        assertFalse(resault);
    }

    @Test
    void IsItRectangular() {
        //GIVEN
        double sideLengthA = 3;
        double sideLengthB = 4;
        double sideLengthC = 5;
        //WHEN
        boolean resault = PythagoreanTheory.isItTheory(sideLengthA, sideLengthB, sideLengthC);
        //THEN
        assertTrue(resault);
    }
}