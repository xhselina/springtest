package com.spring.guides.helloworld;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by junhuiji on 2017/5/11.
 */
public class TestHelloWorldController {
    @Test
    public void testSayHello(){
        Assert.assertEquals("hello,world!",new HelloWorldController().sayHello());
    }
}
