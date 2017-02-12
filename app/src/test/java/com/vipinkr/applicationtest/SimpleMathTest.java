package com.vipinkr.applicationtest;

import com.vipinkr.applicationtest.categories.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Vipin K R on 28-01-2017.
 */

//simple math test
public class SimpleMathTest {

    private SimpleMath sm;

//    @Rule
//    public TestName name=new TestName();



    @Before
    public void setUp() {
        sm = new SimpleMath();
       // System.out.println("ready for testing");
    }

    @After
    public void cleanUp() {
        System.out.println("done with testing");
    }

    @Test
    public void addition_isCorrect() throws Exception {
        SimpleMath sm = new SimpleMath();
        int total = sm.add(4, 3);
        // assertEquals("Addition is not correct", 8, total);

        //hamcrest way
        assertThat(" Addition is not correct", total, equalTo(7));
    }

    @Test
    public void addition_test() throws Exception {
        SimpleMath sm = new SimpleMath();
        int total = sm.add(4, 3);
        // assertEquals("Addition is not correct", 8, total);

        //hamcrest way
        assertThat("Addition is not correct", total, equalTo(7));
    }
}
