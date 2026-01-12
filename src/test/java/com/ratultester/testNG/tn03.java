package com.ratultester.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class tn03 {

    @Test
    public void asserSH(){
        SoftAssert sa = new SoftAssert();
        sa.assertEquals("Ratul","Ratul","Not Matching");
        System.out.println("End of the Soft Assert Program");
        sa.assertAll();
    }
    @Test
    public void asserHS(){
        Assert.assertEquals("Ratul","Ratul","Not Equal");
        Assert.assertEquals("Batul","Batul","Not Equal");
        Assert.assertEquals("Patul","Patul","Not Equal");
        System.out.println("End of the Hard Assert Program");
    }
}
