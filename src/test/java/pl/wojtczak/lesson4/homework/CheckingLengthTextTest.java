package pl.wojtczak.lesson4.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class CheckingLengthTextTest {

    @ParameterizedTest
    @MethodSource("textExample")
    void shouldCheckLengthText(String input,int expected){

        int actual = CheckingLengthText.TextLenght(input);

        Assertions.assertEquals(expected,actual);
    }

    private static Stream<Arguments> textExample(){
        return Stream.of(
                Arguments.of("bmw",3),
                Arguments.of("1990",4),
                Arguments.of("Straight Pipe",12)

        );
    }
}