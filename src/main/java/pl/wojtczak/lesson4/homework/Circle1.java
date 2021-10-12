package pl.wojtczak.lesson4.homework;

public class Circle1 implements CalcAreaPerimeter {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
