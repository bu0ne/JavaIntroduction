package pl.wojtczak.lesson4.homework;

import java.util.Objects;

public class Person {
    private  String name,surname;
    private  int age;
    private  double height,weight;


    public Person(String name, String surname, int age, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.height, height) == 0 && Double.compare(person.weight, weight) == 0 && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, height, weight);
    }
}
