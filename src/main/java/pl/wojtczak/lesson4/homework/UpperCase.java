package pl.wojtczak.lesson4.homework;

public class UpperCase implements TextFormatter {


    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
