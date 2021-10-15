package pl.wojtczak.lesson5.homework.ImprovedCalc;

public class Minus implements ImprovedCalculator{
    @Override
    public double operation(double num1, double num2) {
        return num1 - num2;
    }
}
