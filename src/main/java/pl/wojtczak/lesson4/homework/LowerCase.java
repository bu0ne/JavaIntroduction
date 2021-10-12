package pl.wojtczak.lesson4.homework;

public class LowerCase implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
