package pl.wojtczak.lesson2.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    @Test
    void isEvenNumber17(){
        int i = 17;

        boolean resault = EvenOrOdd.isEven(i);

        assertFalse(resault);
    }

    @Test
    void isEvenNumber2(){
        int i = 2;

        boolean resault = EvenOrOdd.isEven(i);

        assertTrue(resault);
    }
    @Test
    void isOddNumber2(){
        int i = 2;

        boolean resault = EvenOrOdd.isOdd(i);

        assertFalse(resault);
    }
    @Test
    void isOddNumber1(){
        int i = 1;

        boolean resault = EvenOrOdd.isOdd(i);

        assertTrue(resault);
    }
}