package com.brigdelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result=validator.validateUserName("Palak");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result=validator.validateUserName("kt");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateUserName("Xyz");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result=validator.validateUserName("Pp");
        Assert.assertEquals(false,result);
    }


}





