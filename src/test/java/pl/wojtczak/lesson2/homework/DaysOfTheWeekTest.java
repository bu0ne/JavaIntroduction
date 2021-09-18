package pl.wojtczak.lesson2.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaysOfTheWeekTest {

    @Test
    void shouldReturnTuesdayWhenDaysOfTheWeekIs2(){
        int day = 2;

        String resault = DaysOfTheWeek.week(day);

        assertEquals("Tuesday", resault);
    }

    @Test
    void shouldReturnWeekendWhenDaysOfTheWeekIs6(){
        int day = 6;

        String resault = DaysOfTheWeek.week(day);

        assertEquals("Weekend", resault);
    }

    @Test
    void shouldReturnThereIsNoSuchADayWhenDaysOfTheWeekIs10(){
        int day = 10;

        String resault = DaysOfTheWeek.week(day);

        assertEquals("There is no such a day ", resault);
    }

    @Test
    void shouldReturnThereIsNoSuchADayWhenDaysOfTheWeekIsMinus1(){
        int day = -1;

        String resault = DaysOfTheWeek.week(day);

        assertEquals("There is no such a day ", resault);
    }

}