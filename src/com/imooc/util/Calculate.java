package com.imooc.util;

import org.junit.Ignore;
import org.junit.Test;

public class Calculate
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }
    public int multiply(int a,int b)
    {
        return a*b;
        
    }
    public int divide(int a,int b)
    {
        return a/b;
    }
    
    @Test(timeout=1000)
    public void testDeadLoop()
    {
        while(true)
        {
            System.out.println("124");
        }
    }
    @Ignore("这个版本中没有")
    @Test(timeout=1000)
    public void testReadFile()
    {
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}






























