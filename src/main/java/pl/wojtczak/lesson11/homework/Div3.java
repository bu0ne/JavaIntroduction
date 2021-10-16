package pl.wojtczak.lesson11.homework;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Div3 {

    public static List<Integer> Numbers(int from, int to){
        return IntStream.range(from, to)
                .filter(num -> num %3 == 0)
                .boxed()
                .collect(Collectors.toList());
            }

    public static void main(String[] args) {
      Numbers(-10,10).forEach(System.out::print);
    }
}
