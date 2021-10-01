package pl.wojtczak.lesson4.homework;

public class WindowMessage extends Message{

    private final String displeytext = "This is class " + getClass().getSimpleName();

    @Override
    public String getMassage() {
        return displeytext;
    }
}


