package pl.wojtczak.lesson10.homework;

import java.security.PublicKey;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.WeekFields;
import java.util.Locale;


public class Brithday {

    private LocalDate date;

    public Brithday(LocalDate date) {
        this.date = date;
    }

    public int Age() {
        return Period.between(date, LocalDate.now()).getYears();
    }

    public DayOfWeek getDay() {
        return date.getDayOfWeek();
    }

    public int Week() {

        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        return date.get(weekFields.weekOfWeekBasedYear());
    }

}

