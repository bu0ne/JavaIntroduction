package pl.wojtczak.lesson6.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class UpperCaseToFile {

    public static class SaveUpperCaseToFile {

        public static void main(String[] args) throws IOException {
            String file = Files.readString(Path.of("data.txt"));
            System.out.println(file.toUpperCase());
            FileWriter upperFile = new FileWriter("output.txt");
            upperFile.write(file.toUpperCase());
            upperFile.close();


        }
    }
}
