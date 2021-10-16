package pl.wojtczak.lesson10.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SelectionNumbers {

    public static boolean checkNumber(String element, String number){

        Pattern pattern = Pattern.compile(element);
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }

    public static boolean isInt(String number){
        return checkNumber("d^-?\\d+$", number);

    }
    public static boolean isDouble(String number){
        return checkNumber("^-?\\d+\\d+$",number);

    }
    public static boolean isScientificNotation(String number){
        return  checkNumber("^-?\\d+\\.?\\d*(e|E)(-|\\+)\\d+$",number);
    }
}
