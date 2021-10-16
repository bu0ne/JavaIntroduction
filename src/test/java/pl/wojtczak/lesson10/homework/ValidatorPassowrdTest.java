package pl.wojtczak.lesson10.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidatorPassowrdTest {

    @Test
    void shouldPasswordIsCorrect(){

        String pwd = "1Ayetdjfi3";

        boolean isValid = ValidatorPassowrd.iscorrect(pwd);

        Assertions.assertTrue(isValid);
    }
    @Test
    void shouldPasswordIsInCorrect(){

        String pwd = "calypsorot";

        boolean isValid = ValidatorPassowrd.iscorrect(pwd);

        Assertions.assertFalse(isValid);
    }

    @Test
    void shouldPasswordWithYearIsInCorrect(){

        String pwd = "Calyps21";

        boolean isValid = ValidatorPassowrd.iscorrect(pwd);

        Assertions.assertFalse(isValid);
    }

}