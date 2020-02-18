package com.brigdelabz.userregistration;

import java.util.regex.Pattern;

    public class UserValidator {
        private final String USERNAME = "[A-Z]{1}[A-Za-z]{2,}";
        private final String EMAILID="^\\w{3,}([-._+]\\w+)?@\\w+.[a-z]{2,4}([.][a-z]{2,4})?$";
        private final String MOBILENUMBER="^[1-9]{1,3}[ ][1-9]{1}[0-9]{9}$";

        public static void main(String[] args) {
            System.out.println("Welcome to User Registration !");
        }

        public boolean validateUserName(String uname) {
            return Pattern.matches(USERNAME, uname);
        }

        public boolean validateEmailId(String email) {
            return Pattern.matches(EMAILID,email);
        }

        public boolean validateMobileNumber(String mobilenumber) {
            return Pattern.matches(MOBILENUMBER,mobilenumber);

        }
    }
