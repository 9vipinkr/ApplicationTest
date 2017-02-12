package com.vipinkr.applicationtest;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by Vipin K R on 29-01-2017.
 */
//mockito junit local test

public class MockTest {
   int sum;
    @Test
    public void testMock(){
      SimpleMath simpleMath= Mockito.mock(SimpleMath.class);
        System.out.println(simpleMath.getClass());
        Mockito.when(simpleMath.add(4,5)).thenReturn(9);
        sum=simpleMath.add(4,5);
        System.out.println(sum);


    }

}
