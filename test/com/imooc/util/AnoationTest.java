package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * 常用注解 
 * @Test
 *      @Test(expected=XXX.class)
 *      @Test(timeout=毫秒)
 * @BeforeClass
 * @AfterCalss
 * @Before
 * @After
 * 
 * @author rocky
 *
 */
public class AnoationTest
{
 
    @Test()
    //@Test(expected=ArithmeticException.class)
    public void testIDvide()
    {
        assertEquals(1, new Calculate().divide(1,0));
    }

}
