package pl.wojtczak.lesson8;


import java.util.*;

public class OperationOnTheList {
    public static void withoutDuplicates(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        List<String> nonDuplicateList = new ArrayList<>(set);

        System.out.println("Non duplicate list : " + nonDuplicateList);
    }

    public static void reversed(List<String> list) {
        List<String> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);

        System.out.println("Reversed list: " + reversedList);
    }

    public static void replacedNames(String toSwap, String replacement, List<String> list) {
        List<String> listWithReplacedNames = new ArrayList<>(list);
        ListIterator<String> iterator = listWithReplacedNames.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals(toSwap)) {
                iterator.set(replacement);
            }
        }

        System.out.println("List with name " + toSwap + " replaced to " + replacement + " : " + listWithReplacedNames);
    }
}