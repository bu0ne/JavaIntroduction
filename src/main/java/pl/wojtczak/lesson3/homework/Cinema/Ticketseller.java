package pl.wojtczak.lesson3.homework.Cinema;

public class Ticketseller extends BaseEmployee{


    protected Ticketseller(String name, String surname, int year) {
        super(name, surname, year);
    }

    @Override
    public double calculateMonthlySalary() {
    return BASIC_PAYMEANT;
    }
}
