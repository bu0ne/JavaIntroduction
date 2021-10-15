package pl.wojtczak.lesson7.example.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseLettersTest {

    @ParameterizedTest
    @ValueSource(strings = {"e30", "m50b25", "bbs", "airRide",""})
    void shouldReturnUpperCaseLetters(String input) {

        String expected = input.toUpperCase();
        String actual = UpperCaseLetters.changeLettersToUpperCase(input);

        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldReturnEmptyString(String input){

        String expected = "";
        String actual = UpperCaseLetters.changeLettersToUpperCase(input);

        Assertions.assertEquals(expected,actual);

}
}