package pl.wojtczak.lesson7.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadLine {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner in = new Scanner(file);


        for (int j = 1, i = 0; i < 7; i++) {

            String task = in.nextLine();
            if (j % 2 == 0) {
                System.out.println(task);
            }
            j++;

        }
        in.close();
    }
}

