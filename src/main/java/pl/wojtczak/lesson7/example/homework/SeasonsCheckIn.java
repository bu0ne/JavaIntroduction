package pl.wojtczak.lesson7.example.homework;

import java.time.Month;

public class SeasonsCheckIn {
    public static String SeasonsLoad(Month month) {

        String season = "";

        switch (month) {
            case MARCH:
            case APRIL:
            case MAY:
                season = Season.SPRING.toString();
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                season = Season.SUMMER.toString();
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                season = Season.AUTUMN.toString();
                break;
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                season = Season.WINTER.toString();
                break;
        }
        return season;


    }

}
