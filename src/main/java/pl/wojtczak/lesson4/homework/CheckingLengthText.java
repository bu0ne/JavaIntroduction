package pl.wojtczak.lesson4.homework;

public class CheckingLengthText {

    public static int TextLenght(String text){
        if(text == null){
            return 0;
        }
        return text.length();
    }

}
