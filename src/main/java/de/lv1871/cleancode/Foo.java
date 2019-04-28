package de.lv1871.cleancode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Foo {

    public String greeting() {
        List<String> list2Stream = new ArrayList<>();
        list2Stream.add("2");
        list2Stream.add("3");
        List<Integer> collectionOfTwosOnly = list2Stream.stream()
                .map(a -> a.compareTo("2"))
                .collect(Collectors.toList());

        return "Hello World";
    }
}
