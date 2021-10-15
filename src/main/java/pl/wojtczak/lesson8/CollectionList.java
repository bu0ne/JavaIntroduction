package pl.wojtczak.lesson8;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        
        nameList.add("Anna");
        nameList.add("Katarzyna");
        nameList.add("Tymon");
        nameList.add("Tadeusz");
        nameList.add("Anna");
        nameList.add("Karolina");
        nameList.add("Dorota");
        nameList.add("Piotr");

        OperationOnTheList.withoutDuplicates(nameList);
        OperationOnTheList.reversed(nameList);
        OperationOnTheList.replacedNames("Anna", "Joanna", nameList);
    }
}