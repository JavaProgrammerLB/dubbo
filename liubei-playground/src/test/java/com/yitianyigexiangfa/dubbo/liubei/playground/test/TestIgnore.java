package com.yitianyigexiangfa.dubbo.liubei.playground.test;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestIgnore {

    @Ignore("Test is ignored as a demonstration")
    @Test
    public void testSame(){
        assertThat(1, is(1));
    }
}
