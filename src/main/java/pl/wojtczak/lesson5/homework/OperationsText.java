package pl.wojtczak.lesson5.homework;

public class OperationsText {

    public static boolean isEmpty(String text) {
        System.out.println(text.isEmpty());
        return text.isEmpty();
    }

    public static boolean isPalindrome(String text) {
        for (int i = 0; i < text.length(); i++) {
            char element = text.charAt(i);
            char anitype = text.charAt(text.length() - i - 1);
            if (element != anitype) {
                System.out.println("It is not a palindrome");
                return false;
            }
        }
        System.out.println("It is a palindrome");
        return true;
    }

    public static int lengthText(String text) {
        System.out.println("The text is " + text.length() + " characters long");

        return text.length();


    }
}
