package org.example;

import java.util.Arrays;

/*
 5. Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams,
 meaning they contain the same characters in a different order.
 For example, "listen" and "silent" are anagrams.
 */
public class P1E5 {
    public static void main(String[] args) {
        String string1 = "heart";
        String string2 = "earth";

        if (areAna(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }
    }

    public static boolean areAna(String str1, String str2) {
        // remove all whitespace and then change to all lower case for comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();


        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();


        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        return Arrays.equals(charArray1,charArray2);
    }
}
