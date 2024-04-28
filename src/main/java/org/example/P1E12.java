package org.example;
/*
Create Registration Class in which you would have variables such as email, userName and password that have an access scope
only within its own class. After creating an object of the class, the user should be able to call methods and in each method
separately pass values to set users email, username and password.
   Requirements:
   ● Valid email consider to be only yahoo
   ● Valid userName and password cannot be empty and should be of length larger than 6 characters.
     Also, valid passwords cannot contain userName.
 */
public class P1E12 {

    private String email;
    private String userName;
    private String password;

    // for yahoo only
    public boolean setDomain(String email) {
        if (email != null && email.endsWith("@yahoo.com")) {
            this.email = email;
            return true;
        } else {
            System.out.println("Invalid email. Only Yahoo emails are permitted.");
            return false;
        }
    }

    // make sure not empty and not less than 6 in length
    public boolean setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
            return true;
        } else {
            System.out.println("Invalid username. It must be longer than 6 characters and not empty.");
            return false;
        }
    }

    // password length check, not empty, and can't have username
    public boolean setPassword(String password) {
        if (password != null && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
            return true;
        } else {
            System.out.println("Invalid password. It must not be empty, over 6 characters long, and cannot contain the username");
            return false;
        }
    }
    public void displayUserInfo() {
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }
}

class Main {
    public static void main(String[] args) {
        P1E12 user = new P1E12();

        user.setDomain("joshlee@yahoo.com");
        user.setUserName("usernameeee");
        user.setPassword("passworddd");

        user.displayUserInfo();
    }
}
