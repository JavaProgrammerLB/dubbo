package com.yitianyigexiangfa.dubbo.liubei.playground.test;

import org.easymock.internal.matchers.InstanceOf;
import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.*;

public class AssertTest {

    @Test
    public void assertArrayEqualTest() {
        byte[] expected = "trail".getBytes();
        byte[] actual = "trail".getBytes();
        assertArrayEquals("-failue", expected, actual);
    }

    @Test
    public void assertNotNullTest() {
        assertNotNull("fail", new Object());
    }

    @Test
    public void assertNotSameTest() {
        Object a = new Object();
        assertNotSame("-failue, if false, you will see me. ", null, a);
    }

    @Test
    public void assertThatStartWithTest() {
        assertThat("good", startsWith("g"));
    }

    @Test
    public void eaualsToTest() {
        assertThat("good", equalTo("good"));
    }

    @Test
    public void notTest() {
        assertThat("good", not(startsWith("a")));
    }

    @Test
    public void allOfTest() {
        assertThat("good", allOf(equalTo("good"), startsWith("good"), startsWith("goo")));
    }

    @Test
    public void sameInstanceTest() {
        assertThat(new Object(), not(sameInstance(new Object())));
    }

    @Test
    public void anyOfTest() {
        assertThat(new Object(), anyOf(not(sameInstance(new Object()))));
    }

    @Test
    public void Test() {
        assertThat(7, not(CombinableMatcher.either(equalTo(3)).or(equalTo(4)).or(equalTo(8))));
    }

    @Test
    public void assertThathasItemsTest() {
        assertThat("-failue, first arg test. ", Arrays.asList("one", "two", "three"), hasItems("one", "two"));
    }

    @Test
    public void assertTahtEveryItemsContains() {
        assertThat("-failure", Arrays.asList("one", "nine", "eight"), everyItem(containsString("e")));
    }

    @Test
    public void assertThatHamcrestCoreMatchersTest() {
        assertThat("good", allOf(equalTo("good"), startsWith("good")));
        assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
        assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
        assertThat(7, not(CombinableMatcher.<Integer>either(equalTo(3)).or(equalTo(4))));
        assertThat(new Object(), not(sameInstance(new Object())));
    }

    @Test
    public void assertThatHamcrestCoreAllOfTest() {
        assertThat("good", allOf(startsWith("g"), startsWith("go"), startsWith("goo")));
    }


}
