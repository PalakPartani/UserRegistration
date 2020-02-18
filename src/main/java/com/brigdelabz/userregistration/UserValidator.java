package com.brigdelabz.userregistration;

import java.util.regex.Pattern;

    public class UserValidator {
        private final String USERNAME = "[A-Z]{1}[A-Za-z]{2,}";
        private final String EMAILID="^\\w{3,}([-._+]\\w+)?@\\w+.[a-z]{2,4}([.][a-z]{2,4})?$";
        private final String MOBILENUMBER="^[1-9]{1,3}[ ][1-9]{1}[0-9]{9}$";
        private final String PASSWORD_RULE1 = "^[\\w\\s]{8,}$";
        private final String PASSWORDRULE2 = "^(?=.*[A-Z]).{8,}$";

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

        public boolean validatePassword(String password) {
            return Pattern.matches(PASSWORD_RULE1, password);
        }

        public boolean validatePassword1(String uppercase) {
            return Pattern.matches(PASSWORDRULE2,uppercase);
        }
    }
