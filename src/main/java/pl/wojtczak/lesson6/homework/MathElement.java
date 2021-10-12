package pl.wojtczak.lesson6.homework;

public class MathElement {

    public static double calcSquare(double num1) {
        if (num1 < 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(num1);

    }

    public static void main(String[] args) {
        System.out.println(calcSquare(-1));
    }
}
