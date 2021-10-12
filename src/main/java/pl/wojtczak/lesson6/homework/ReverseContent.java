package pl.wojtczak.lesson6.homework;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReverseContent {

    public static void main(String[] args) throws IOException {
        String text = Files.readString(Path.of("data.txt"));
        StringBuilder textReverse = new StringBuilder().append(text).reverse();

        System.out.println(textReverse);


        }
    }


