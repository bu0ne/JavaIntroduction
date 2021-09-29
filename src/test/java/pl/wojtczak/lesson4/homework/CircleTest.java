package pl.wojtczak.lesson4.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldCalculateTheArea(){
       Circle circle = new Circle(6);
       double area = circle.getArea();

        Assertions.assertEquals(113.09733552923255,area);


    }

    @Test
    void shouldCalculateThePerimeter() {
        Circle circle = new Circle(4);
                double perimeter = circle.getPerimeter();

        Assertions.assertEquals(25.132741228718345,perimeter);
    }
}