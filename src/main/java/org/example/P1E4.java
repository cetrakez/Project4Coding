package org.example;
/*
4. Check if a String is Palindrome: Determine whether a given string is a palindrome,
which means it reads the same forwards and backward.
For example, "madam" is a palindrome.
 */
public class P1E4 {
    public static void main(String[] args) {
        String str = "racecar";
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reversedStr = st.toString();
        if(str.equals(reversedStr)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
