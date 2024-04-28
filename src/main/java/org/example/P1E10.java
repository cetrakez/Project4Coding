package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/*
10. How can you remove all duplicates from ArrayList?
 */
public class P1E10 {
    public static void main(String[] args) {
        ArrayList<String> listWith = new ArrayList<>();
        listWith.add("Apple");
        listWith.add("Banana");
        listWith.add("Apple");
        listWith.add("Banana");
        listWith.add("Orange");
        listWith.add("Mango");


        Set<String> set = new LinkedHashSet<>(listWith);
        ArrayList<String> listWithout = new ArrayList<>(set);

        System.out.println("List after removing duplicates: " + listWithout);
    }
}
