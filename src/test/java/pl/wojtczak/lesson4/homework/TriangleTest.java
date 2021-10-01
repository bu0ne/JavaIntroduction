package pl.wojtczak.lesson4.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldCalculateTheArea() {
        Triangle triangle = new Triangle(2,5,6,2);
        double area = triangle.getArea();

        Assertions.assertEquals(6,area);

    }

    @Test
    void shouldCalculateThePerimeter() {
        Triangle triangle = new Triangle(2,5,6,2);
        double perimeter = triangle.getPerimeter();

        Assertions.assertEquals(13,perimeter);
    }
}