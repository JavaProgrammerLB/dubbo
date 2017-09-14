package com.yitianyigexiangfa.dubbo.liubei.playground.test;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestException {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){
        new ArrayList<Object>().get(0);
    }

    @Test
    public void testExcepiontMessage(){
        try {
            new ArrayList<Object>().get(0);
            fail("Expected an IndexOutOfBoundsException to be throen");
        } catch (IndexOutOfBoundsException anIndexOutOfBoundsException){
            assertThat(anIndexOutOfBoundsException.getMessage(), is("Index: 0, Size: 0"));
        }
    }

    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
        List<Object> list = new ArrayList<Object>();

        thrown.expect(IndexOutOfBoundsException.class);
//        thrown.expectMessage("Index: 0, Size: 0");
        thrown.expectMessage(containsString("Size: 0"));
        list.get(0);
    }



}
