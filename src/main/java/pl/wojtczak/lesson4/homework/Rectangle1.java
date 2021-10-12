package pl.wojtczak.lesson4.homework;

public class Rectangle1 implements CalcAreaPerimeter {

    private int sideLengthA;
    private int sideLengthB;

    public Rectangle1(int sideLengthA, int sideLengthB) {
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;

    }

    @Override
    public double getArea() {
        return sideLengthA * sideLengthB;
    }

    @Override
    public double getPerimeter() {
        return 2 * sideLengthA + 2 * sideLengthB;
    }
}
