package pl.wojtczak.lesson6.homework;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class WordFinder {

    public static void main(String[] args) throws IOException{

        String textInFile = Files.readString(Path.of("data.txt"));

        System.out.println(textInFile.contains("Siódma"));


        }


    }
