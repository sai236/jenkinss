package com.test.jenkinss.t1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest
public class Mtt   extends AbstractTestNGSpringContextTests {

    @Autowired
    private MyTest myTest;

    @Test
    public void test(){
        System.out.println("start");
        System.out.println(myTest.getStr());
        System.out.println("end");
        Assert.assertTrue(true);
    }
}
