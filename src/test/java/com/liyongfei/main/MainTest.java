package com.liyongfei.main;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author liyongfei
 * @date 2018/6/20
 */
public class MainTest {
    @org.testng.annotations.Test
    public void testSum() throws Exception {
        Main main = new Main();
        Assert.assertEquals(main.sum(2,3),5);
    }
    @Test
    public void testSay() throws Exception {
        Main main = new Main();
        Assert.assertEquals(main.say("hello"),"hello7");
    }

}