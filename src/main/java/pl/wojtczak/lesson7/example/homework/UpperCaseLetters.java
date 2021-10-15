package pl.wojtczak.lesson7.example.homework;


public class UpperCaseLetters {

    public static String changeLettersToUpperCase(String text) {
        if (text == null) {
            return "";
        }
        return text.toUpperCase();
    }
}
