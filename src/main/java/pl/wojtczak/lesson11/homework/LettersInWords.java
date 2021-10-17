package pl.wojtczak.lesson11.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LettersInWords {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("Mercedes", "Audi", "Toyota ", "Honda", "Yamaha",
                "Subaru", "Mitsubishi", "Infiniti", "Nissan"));

        List<String> wordsToUpperCase = words
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        wordsToUpperCase.forEach(System.out::println);
    }

    public static String removeDuplicates(String entry) {
        StringBuilder stringBuilder = new StringBuilder();

        entry
                .chars()
                .distinct()
                .forEach(a -> stringBuilder.append((char) a));
        return stringBuilder.toString();
    }
}
