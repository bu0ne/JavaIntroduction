package pl.wojtczak.lesson4.homework;

public class ConsoleMessage extends Message {

    private final String displeyText = "This is class " + getClass().getSimpleName();

    @Override
    public String getMassage() {
        return displeyText;
    }
}
