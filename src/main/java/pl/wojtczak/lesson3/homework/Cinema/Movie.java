package pl.wojtczak.lesson3.homework.Cinema;

public class Movie {

    private final String titleOfTheMovie;
    private final String nameAndSurnameOfTheDirector;
    private final short durationMinutes;
    private final int yearOfProduction;

    public Movie(String titleOfTheMovie, String nameAndSurnameOfTheDirector, short durationOfTheMovie, int yearOfProduction) {
        this.titleOfTheMovie = titleOfTheMovie;
        this.nameAndSurnameOfTheDirector = nameAndSurnameOfTheDirector;
        this.durationMinutes = durationOfTheMovie;
        this.yearOfProduction = yearOfProduction;
    }

    public String getTitleOfTheMovie() {
        return titleOfTheMovie;
    }

    public String getNameAndSurnameOfTheDirector() {
        return nameAndSurnameOfTheDirector;
    }

    public short getDurationMinutes() {
        return durationMinutes;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}

