package com.blp.uesrregistration;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitUserRegistrationTest {
    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();
    
    @Test
    public void givenFirstNameIsProperReturnTrue() {
        boolean result = junitUserRegistration.firstName("Sayali");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstNameIsProperReturnFalse() {
        boolean result = junitUserRegistration.firstName("SaYali");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastNameIsProperReturnTrue() {
        boolean result = junitUserRegistration.lastName("Bodake");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastNameIsProperReturnFalse() {
        boolean result = junitUserRegistration.lastName("BoDake");
        Assert.assertEquals(false, result);
    }


    @Test
    public void givenEmailIdIsProperReturnTrue() {
        boolean result = junitUserRegistration.emailId("sayalibodake28@gmail.com");
        Assert.assertEquals(true, result);
    }


    @Test
    public void givenEmailIdIsProperReturnFalse() {
        boolean result = junitUserRegistration.emailId("sayalibodake28gmail.com");
        Assert.assertEquals(false, result);
    }
}