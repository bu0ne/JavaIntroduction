package pl.wojtczak.lesson7.homework;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class ReadData {


    public static class ReadyToRead {
        public static void main(String[] args) throws IOException {

            String file = Files.readString(Path.of("data.txt"));
            System.out.println(file);
        }
    }
}
