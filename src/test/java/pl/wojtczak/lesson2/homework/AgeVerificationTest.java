package pl.wojtczak.lesson2.homework;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AgeVerificationTest {

    @Test
    void IsNotAdult(){
        int age = 17;
        AgeVerification ageVerification = new AgeVerification();

        boolean resault = ageVerification.isAdult(age);

        assertFalse(resault);
    }
    @Test
    void IsAdult(){
        int age = 18;
        AgeVerification ageVerification = new AgeVerification();

        boolean resault = ageVerification.isAdult(age);

        assertTrue(resault);
    }

}
