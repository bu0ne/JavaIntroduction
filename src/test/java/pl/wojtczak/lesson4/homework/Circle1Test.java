package pl.wojtczak.lesson4.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Circle1Test {

    @Test
    void shouldCalculateTheArea() {
        Circle1 circle1 = new Circle1(6);
        double area = circle1.getArea();

        Assertions.assertEquals(113.09733552923255, area);
    }

    @Test
    void shouldCalculateThePerimeter() {
        Circle1 circle1 = new Circle1(4);
        double perimeter = circle1.getPerimeter();

        Assertions.assertEquals(25.132741228718345, perimeter);


    }


}
