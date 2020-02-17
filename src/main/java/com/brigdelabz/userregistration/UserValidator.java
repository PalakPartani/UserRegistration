package com.brigdelabz.userregistration;

import java.util.regex.Pattern;

    public class UserValidator {
    final String FIRSTNAME="[A-Z]{1}[A-Za-z]{2,}";

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration !");
    }

    public boolean validateFirstName(String fname){
        return Pattern.matches(FIRSTNAME,fname);
    }
}
