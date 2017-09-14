package com.yitianyigexiangfa.dubbo.liubei.playground.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//@FixMethodOrder(MethodSorters.JVM)
//@FixMethodOrder(MethodSorters.DEFAULT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestExecutionOrder {

    @Test
    public void TestB(){
        System.out.println("This is B");
    }

    @Test
    public void TestA(){
        System.out.println("This is A");
    }

    @Test
    public void TestC(){
        System.out.println("This is C");
    }
}
