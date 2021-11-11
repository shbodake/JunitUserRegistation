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
        boolean result = junitUserRegistration.firstName("Sayali");
        Assert.assertEquals(false, result);
    }
}