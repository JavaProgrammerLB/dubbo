package com.yitianyigexiangfa.dubbo.liubei.playground.test;

import com.yitianyigexiangfa.dubbo.liubei.playground.Caculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaculatorEvaluateTest {

    @Test
    public void evaluateTest() {
        Caculator c = new Caculator();
        int result = c.evaluate("1+2+3");
        assertEquals(6, result);
    }

    @Test
    public void evaluateTest2(){
        Caculator c = new Caculator();
        int result = c.evaluate("1+2+3+4");
        assertEquals(10, result);
    }
}
