package pl.wojtczak.lesson6.homework;

public class Pesel {


    public static String CheckingPESEL(String PESEL) {

        if (PESEL.length() != 11) {
            throw new IllegalLengthException("PESEL should have 11 numbers");
        }
        if (!(PESEL.matches("[0-9]+"))) {

            throw new WrongTypeOfDataException("Pesel should only have numbers from 0 to 9");
        }
        return "Your Pesel has been accepted";
    }

    public static void main(String[] args) {
        System.out.println(CheckingPESEL("21312321312312312"));
        System.out.println(CheckingPESEL("21asdasdas12321312312312"));
    }
}
