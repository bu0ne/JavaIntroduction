package pl.wojtczak.lesson4.homework;

public class TriangleToString {
    private double width, height;

    public TriangleToString(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "TriangleToString{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
