package pl.wojtczak.lesson10.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;


class BrithdayTest {

    Brithday date = new Brithday(LocalDate.of(1993,2,18));
    @Test
    void shouldVerifyAge(){

        int age = date.Age();

        Assertions.assertEquals(28,age);
    }
    @Test
    void shouldVerifyWeek(){

        int week = date.Week();

        Assertions.assertEquals(7,week);

    }
    @Test
    void shouldVerifyDay(){

        DayOfWeek day = date.getDay();

        Assertions.assertEquals(DayOfWeek.THURSDAY, day);
    }
}