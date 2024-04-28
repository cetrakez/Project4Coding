package org.example;
/*
1. Write a program to swap 2 String without a temporary variable?
* */
public class P1E1 {
    public static void main(String[] args) {
        String string1 = "Cat";
        String string2 = "Dog";


        // Append both of the strings to update string1
        string1 = string1 + string2;

        // string1 now holds string1 & string2
        // string2 is full length of string1(CatDog) minus Dog
        string2 = string1.substring(0,string1.length() - string2.length());

        // string1 becomes CatDog - (3) starting at string2 length so "Dog"
        string1 = string1.substring(string2.length());

        // fully swapped, printing out
        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
    }
}
