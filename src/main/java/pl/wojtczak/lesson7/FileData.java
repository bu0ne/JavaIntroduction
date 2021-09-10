package pl.wojtczak.lesson7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileData {

        public static void main(String[] args) throws FileNotFoundException {
            PrintWriter file = new PrintWriter("data.txt");
            file.println("Kurs");
            file.println("Java");
            file.println("Lekcja 6");
            file.println("Pliki");
            file.println("Wyjątki");
            file.println("Pliki");
            file.println("Koniec Pliku");
            file.close();
        }
    }

