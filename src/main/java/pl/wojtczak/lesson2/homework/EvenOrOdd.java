package pl.wojtczak.lesson2.homework;

public class EvenOrOdd {

    public static boolean isEven(int i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int i) {
        return !isEven(i);

    }

}
