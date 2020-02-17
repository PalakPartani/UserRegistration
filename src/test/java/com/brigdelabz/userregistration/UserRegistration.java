package com.brigdelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result=validator.validateFirstName("Palak");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result=validator.validateFirstName("Pa");
        Assert.assertEquals(false,result);
    }
    }





