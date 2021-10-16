package pl.wojtczak.lesson5.homework;

public class Car extends Vehicle {
    private boolean engineStarted;

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    public void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }


    @Override
    public boolean forwardRide() {
        return true;
    }

    @Override
    public boolean backwardRide() {
        return true;
    }
}
