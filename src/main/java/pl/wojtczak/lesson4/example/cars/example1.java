package pl.wojtczak.lesson4.example.cars;

public class example1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car bmw = new Car(2,Brand.Bmw,"3");

        System.out.println(myCar.mileage);
        System.out.println(bmw.mileage);




}}
