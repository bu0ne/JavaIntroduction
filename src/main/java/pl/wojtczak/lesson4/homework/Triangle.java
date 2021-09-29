package pl.wojtczak.lesson4.homework;

public class Triangle extends Shape{
    private double sideLengthB;
    private double sideLengthC;
    private double sideLengthA;
    private double hightOfTheTriangle;

    public Triangle(double sideLengthB, double sideLengthC, double sideLengthA, double hightOfTheTriangle) {
        this.sideLengthB = sideLengthB;
        this.sideLengthC = sideLengthC;
        this.sideLengthA = sideLengthA;
        this.hightOfTheTriangle = hightOfTheTriangle;
    }

    @Override
    public double getArea() {
        return 0.5* sideLengthA * hightOfTheTriangle;
    }

    @Override
    public double getPerimeter() {
        return sideLengthA + sideLengthB + sideLengthC;
    }
}
