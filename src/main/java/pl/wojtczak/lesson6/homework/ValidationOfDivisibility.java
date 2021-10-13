package pl.wojtczak.lesson6.homework;

public class ValidationOfDivisibility {

    public static void validate(int[] values) {
        for (int value : values) {
            try {
                if (value % 3 != 0) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println(value + " indivisible");
                continue;
            }
            int result = value / 3;
            System.out.println(value + " / 3 = " + result);
        }

    }

    public static void main(String[] args) {
        int[] num1={4,1,6,12,251,12};
        ValidationOfDivisibility.validate(num1);
    }
}
