package pl.wojtczak.lesson9.homework;


import org.apache.commons.math3.util.Pair;

public class MainPair {


    public static void main(String[] args) {
        Pair<String, String> variable = new Pair<>("M50b20"," e30");
        Pair<String, String> variable1= new Pair<>("m50b25"," e30");

        System.out.print(variable.getKey());
        System.out.println(variable.getValue());
        System.out.print(variable1.getKey());
        System.out.println(variable.getValue());
    }
}
