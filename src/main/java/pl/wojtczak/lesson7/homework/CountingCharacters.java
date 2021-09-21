package pl.wojtczak.lesson7.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

    public class CountingCharacters {

        public static void main(String[] args) throws IOException {

            System.out.println(Files.lines(Paths.get("data.txt")).mapToInt(String::length).sum());
        }
    }

