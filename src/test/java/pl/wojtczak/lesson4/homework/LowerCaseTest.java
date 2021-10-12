package pl.wojtczak.lesson4.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LowerCaseTest {

    @Test
    void shouldLowerCaseText() {
        LowerCase lowerCase = new LowerCase();
        String text = lowerCase.formatText("E30BAWARIA");
        Assertions.assertEquals("e30bawaria", text);
    }


}