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

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result=validator.validateEmailId("abc.xyz@bl.co.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result=validator.validateEmailId("abc.@gmail.com");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenMobileNumber_WhenProper_Should_Return_True() {
        UserValidator validator = new UserValidator();
        boolean result=validator.validateMobileNumber("91 9919819801");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenMobileNumber_WhenImproper_Should_Return_False() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("91919819100");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPassword_WhenMinimumEightCharacter_Should_Return_True() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("asdfghjk");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPassword_WhenLessthanEightCharacter_Should_Return_False() {
        UserValidator validator=new UserValidator();
        boolean result = validator.validatePassword("plkklp");
        Assert.assertEquals(false,result);
    }

}