package pl.wojtczak.lesson8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonApp {

    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Andrzej","Kowalski", 1976, 189, 70));
        persons.add(new Person("Kamil","Maszczak", 1987, 170, 90));
        persons.add(new Person("Adrian","Rafalczeski", 1970, 160, 73));
        persons.add(new Person("Artur","Wojtczak", 1993, 198, 103));

        System.out.println("\n" +
                "From the youngest to the oldest");
        for(Person person : persons){
            System.out.println(person.toString());
        }


        Set<Person> persons1 = new TreeSet<>(Comparator.comparingInt(Person::getHeight));
        persons1.addAll(persons);

        System.out.println("\n" +
                "Sort by height from lowest to highest: ");
        for (Person person : persons1){
            System.out.println(person.toString());
        }
        Set<Person> persons2 = new TreeSet<>(Comparator.comparingDouble(Person::getWeight));
        persons2.addAll(persons);
        System.out.println("\n" +
                "Sort by weight  from light to heaviest");
        for(Person person : persons2){
            System.out.println(person.toString());
        }


    }
}
