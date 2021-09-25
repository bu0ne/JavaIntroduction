package pl.wojtczak.lesson3.homework.Cinema;

public abstract class BaseEmployee {

    protected static final double BASIC_PAYMEANT = 3000;


    private String name;
    private String surname;
    private int year;

    protected BaseEmployee(String name, String surname,int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public abstract double calculateMonthlySalary();

    public int employemntTime(int currentYear){
        return currentYear - this.year;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }
}
