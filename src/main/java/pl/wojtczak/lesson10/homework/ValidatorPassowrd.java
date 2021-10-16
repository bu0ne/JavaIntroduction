package pl.wojtczak.lesson10.homework;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorPassowrd {

    private static String currentYear = String.valueOf(LocalDateTime.now().getYear());
    private static String year = currentYear.substring(2,4);
    private static final Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=\\S+$).{7,}$");

    public static boolean iscorrect(String pwd){
        if(pwd.contains(currentYear) || pwd.contains(year)) {
            return false;
        }else{
            Matcher matcher = pattern.matcher(pwd);
            return matcher.matches();
        }
    }
}