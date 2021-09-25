package pl.wojtczak.lesson3.homework.Cinema;

public class Manager extends BaseEmployee{

    private final static double OVER_BASIC_PAYMENT = 2000;
    private double extraCash;



    protected Manager(String name, String surname, int year, double extraCash) {
        super(name, surname, year);
        this.extraCash = extraCash;
    }

    public void setExtraCash(double extraCash) {
        this.extraCash = extraCash;
    }

    public double getExtraCash() {
        return extraCash;
    }


    @Override
    public double calculateMonthlySalary() {
        return BASIC_PAYMEANT + OVER_BASIC_PAYMENT + extraCash;
    }


}
