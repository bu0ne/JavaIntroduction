package pl.wojtczak.lesson4.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldCalculateTheArea() {
        Square square = new Square(2);
        double area = square.getArea();

        Assertions.assertEquals(4,area);
    }

    @Test
    void ShouldCalculateThePermieter() {
        Square square = new Square(2);
        double permieter = square.getPerimeter();

        Assertions.assertEquals(8,permieter);
    }
}