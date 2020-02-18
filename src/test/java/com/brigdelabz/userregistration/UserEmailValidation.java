package com.brigdelabz.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class UserEmailValidation {
    private String emailId;
    private boolean expectedResult;
    private UserValidator validator;

    public UserEmailValidation(String emailId, boolean expectedResult) {
        this.emailId = emailId;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize(){
        validator=new UserValidator();
    }

    @Parameterized.Parameters
    public static Collection emailCollection() {
        return Arrays.asList(new Object[][] {{"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc-gmail.com",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc123@.com",false},
                {"abc123@.com.com",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%*.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@gmail.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false}});
}

    @Test
    public void checkUserEmailId() {
        Assert.assertEquals(expectedResult,validator.validateEmailId(this.emailId));
    }
}

