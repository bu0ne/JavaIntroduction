package pl.wojtczak.lesson4.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rectangle1Test {

    @Test
    void shouldCalculateTheArea() {
        Rectangle1 rectangle1 = new Rectangle1(2,3);
        double area = rectangle1.getArea();

        Assertions.assertEquals(6,area);
    }

    @Test
    void shouldCalculateThePerimeter() {
        Rectangle1 rectangle1 = new Rectangle1(2,3);
        double perimeter = rectangle1.getPerimeter();

        Assertions.assertEquals(10,perimeter);
    }
}
