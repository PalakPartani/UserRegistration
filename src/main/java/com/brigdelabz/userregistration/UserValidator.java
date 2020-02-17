package com.brigdelabz.userregistration;

import java.util.regex.Pattern;

    public class UserValidator {
        final String USERNAME = "[A-Z]{1}[A-Za-z]{2,}";
        final String EMAILID =  "^[A-Za-z]*([.|+|-|_]?[A-Za-z]+)?[@]{1}[A-Za-z]{2,}[.]{1}[A-Za-z]{2,}([.]?[A-Za-z]{2,})?$";

        public static void main(String[] args) {
            System.out.println("Welcome to User Registration !");
        }

        public boolean validateUserName(String uname) {
            return Pattern.matches(USERNAME, uname);
        }

        public boolean validateEmailId(String email) {
            return Pattern.matches(EMAILID,email);
        }
    }