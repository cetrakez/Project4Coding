package org.example;

import java.util.ArrayList;

/*
8. You have a list of strings, and you want to keep only those that
start with “A” and you want to return them in lowercase".
 */
public class P1E8 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Apricot");
        fruits.add("Kiwi");
        fruits.add("Avocado");
        fruits.removeIf(x -> !x.startsWith("A"));

        for (String fruit : fruits) {
            System.out.println(fruit.toLowerCase());
        }
    }
}
