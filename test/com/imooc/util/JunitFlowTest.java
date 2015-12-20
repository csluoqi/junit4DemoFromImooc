package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * setUpBeforeClass在测试类执执行时要执行的第一个方法,它只会被内存加载一份实例,比较适合加载配置文件,
 * setUp 在每一个被测试的方法执行前要执行的方法
 * test 被测试的方法
 * tearDown 在每一个被测试的方法执行后要执行的方法
 * tearDownAfterClass 在测试类执执行结束时要执行的第一个方法 比较适合做清理比如关闭数据库连接等
 * @author rocky
 *
 */
public class JunitFlowTest
{

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        System.out.println("setUpBefore");
    }

    /**
     * 静态类,抛出了异常
     * @throws Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
        System.out.println("tearDownAfter");
    }

    @Before
    public void setUp() throws Exception
    {
        System.out.println("setUp");
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("tearDown");
    }

    @Test
    public void test1()
    {
       System.out.println("test1");
    }

    @Test
    public void test2()
    {
       System.out.println("test2");
    }
}
