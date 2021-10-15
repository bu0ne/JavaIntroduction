package pl.wojtczak.lesson5.homework;

public class Bicycle extends Vehicle {

    @Override
    public boolean forwardRide() {
        return true;
    }

    @Override
    public boolean backwardRide() {
        return false;
    }
}