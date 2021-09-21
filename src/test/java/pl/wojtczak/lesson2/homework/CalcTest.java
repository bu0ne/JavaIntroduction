package pl.wojtczak.lesson2.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    void shouldAddTwoValues1and1() {
        int add = Calculator.add(1, 1);

        Assertions.assertEquals(2, add);
    }
    @Test
    void shouldSubTwoValues1and1() {
        int sub= Calculator.sub(1, 1);

        Assertions.assertEquals(0, sub);
    }
    @Test
    void shouldMultiTwoValues2and2() {
        int multi = Calculator.multi(2, 2);

        Assertions.assertEquals(4, multi);
    }
    @Test
    void shouldDivisionTwoValues4and2() {
        int divi = Calculator.divi(4, 2);

        Assertions.assertEquals(2, divi);
    }

    @Test
    void shouldModuloTwoValues4and2() {
        int modulo = Calculator.modulo(4, 2);

        Assertions.assertEquals(0, modulo);
    }
}

