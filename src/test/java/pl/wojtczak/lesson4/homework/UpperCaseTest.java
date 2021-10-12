package pl.wojtczak.lesson4.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class UpperCaseTest {


    @Test
    void shouldUpperCaseText() {
        UpperCase upperCase = new UpperCase();
        String text = upperCase.formatText("calypsorot");

        Assertions.assertEquals("CALYPSOROT", text);


    }

}