package pl.wojtczak.lesson10.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorPESEL {

    public static boolean validatePesel(String[] args) {
        Pattern pattern = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        Matcher matcher = pattern.matcher("1234567890111");

        return matcher.matches();


    }

    public static void main(String[] args) {
        System.out.println(validatePesel(args));
    }
}

