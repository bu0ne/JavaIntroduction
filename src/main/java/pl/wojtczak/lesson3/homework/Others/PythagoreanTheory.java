package pl.wojtczak.lesson3.homework.Others;

public class PythagoreanTheory {

    static boolean isItTheory(double sideLengthA, double sideLengthB, double sideLengthC ) {
        return Math.pow(sideLengthC, 2) == Math.pow(sideLengthA, 2) + Math.pow(sideLengthB, 2);
    }

}
