package pl.wojtczak.lesson4.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateTheArea() {
        Rectangle rectangle = new Rectangle(2,3);
        double area = rectangle.getArea();

        Assertions.assertEquals(6,area);
    }

    @Test
    void shouldCalculateThePerimeter() {
        Rectangle rectangle = new Rectangle(2,3);
        double perimeter = rectangle.getPerimeter();

        Assertions.assertEquals(10,perimeter);
    }
}