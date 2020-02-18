package com.brigdelabz.userregistration;

import java.util.regex.Pattern;

    public class UserValidator {
        private final String USERNAME = "[A-Z]{1}[A-Za-z]{2,}";
        private final String EMAILID="^\\w{3,}([-._+]\\w+)?@\\w+.[a-z]{2,4}([.][a-z]{2,4})?$";
        private final String MOBILENUMBER="^[1-9]{1,3}[ ][1-9]{1}[0-9]{9}$";
        public static final String PASSWORD1 = "^[\\w\\s]{8,}$";
        public static final String PASSWORD2 = "^(?=.*[A-Z]).{8,}$";
        public static final String PASSWORD3= "^(?=.*[A-Z])(?=.*[0-9]).{8,}";
        public static final String PASSWORD4 = "^((?=[^\\W\\_]*[\\W\\_][^\\W\\_]*$)(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9\\W\\_]{8,})$";



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

        public boolean validatePassword(String password,String pattern) {
            return password.matches(pattern);
        }
    }
