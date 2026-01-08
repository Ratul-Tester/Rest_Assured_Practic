package com.ratultester.testNG;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class tn02 {

    @Description("#TC-1 tn02 test1")
    @Test
    public void test1(){
        System.out.println("TC 1");
    }
    @Description("#TC-2 tn02 test2")
    @Test
    public void test2(){
        System.out.println("TC 2");
    }
    @Description("#TC-3 tn02 test3")
    @Test
    public void test3(){
        System.out.println("TC 3");
    }
}
