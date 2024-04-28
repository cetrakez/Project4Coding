package org.example;
/*
2. Find out how many alpha characters are present in a string?
 */
public class P1E2 {
    public static void main(String[] args) {
        String str = "Call me baby 1-800-NEED-LOVE";
        //using str.replaceAll to remove everything EXCEPT A-Z and a-z for the entire str length
        System.out.println(str.replaceAll("[^A-Za-z]", "").length());

    }
}
