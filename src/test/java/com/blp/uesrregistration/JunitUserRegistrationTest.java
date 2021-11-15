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
    @Test
    public void givenMobileNumberIsProperReturnTrue() {
        boolean actualResult = junitUserRegistration.mobileNumber("91 9850521236");
        Assert.assertEquals(true, actualResult);
    }
    @Test
    public void givenMobileNumberIsProperReturnFalse() {
        boolean actualResult = junitUserRegistration.mobileNumber("919850521236");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenPasswordRule1IsProperReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule1("gfdhbgtkj");
        Assert.assertEquals(true, actualResult);
    }
    @Test
    public void givenPasswordRule1IsNotProperReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule1("qwgthjkdla");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenPasswordRule2IsProperReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule2("qwgthRLjkdl");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule2IsNotProperReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule2("jnsdjcvcp");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenPasswordRule3IsProperReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule3("qw98hRLkdl");
        Assert.assertEquals(true, actualResult);
    }
    @Test
    public void givenPasswordRule3IsNotProperReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule3("jnsdjcvcp");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenPasswordRule4IsProperReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule4("qw98hRL@&dl");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule4IsNotProperReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule4("jsdjcvcp");
        Assert.assertEquals(false, actualResult);
    }
}