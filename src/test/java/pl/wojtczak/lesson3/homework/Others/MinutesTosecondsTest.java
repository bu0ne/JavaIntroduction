package pl.wojtczak.lesson3.homework.Others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MinutesToSecondsTest {

    @Test
    void shouldReturn300SecondsWhenIs5Minutes(){
        int mToS = MinutesToSeconds.mToS(5);

        Assertions.assertEquals(300,mToS);

    }

    @Test
    void shouldReturn600SecondsWhenIs10Minutes(){
        int mToS = MinutesToSeconds.mToS(10);

        Assertions.assertEquals(600,mToS);

    }

}