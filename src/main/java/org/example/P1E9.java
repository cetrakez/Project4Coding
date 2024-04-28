package org.example;
/*
9. Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character.
For example, in the string "abracadabra", the first non-repeating character is 'c'.
 */
public class P1E9 {
    public static void firstNonRepeat(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println("First non-repeating character is " + c);
                return;
            }
        }
        System.out.println("No non-repeating character found.");
    }
    public static void main(String[] args) {
        String s = "abracadabra";
        firstNonRepeat(s);
    }
}
