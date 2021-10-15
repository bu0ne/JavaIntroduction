package pl.wojtczak.lesson5.homework.ImprovedCalc;

public class Addition implements ImprovedCalculator{

    @Override
    public double operation(double num1, double num2) {
        return num1 + num2;
    }
}
