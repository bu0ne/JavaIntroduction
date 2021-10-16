package pl.wojtczak.lesson5.homework;

import static pl.wojtczak.lesson5.homework.OperationsText.*;

public class OperationsTextApp {

    public static void main(String[] args) {
        String text = "peep";
        if (!OperationsText.isEmpty(text)) {
            isPalindrome("peep");
            lengthText("peep");

        }
    }
}
