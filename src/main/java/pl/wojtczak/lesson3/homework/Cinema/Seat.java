package pl.wojtczak.lesson3.homework.Cinema;

public class Seat {

    private final int seatNumber;
    private final int rowNumber;
    private boolean available;

    public Seat(int seatNumber, int rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void toggle() {
        this.available = !available;
    }
}
