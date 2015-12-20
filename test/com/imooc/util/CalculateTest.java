package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * junit 测试实力,是按照imooc.com的教程敲的代码
 * 1.为了规范
 * 需要新建一个sourceFolder,命名为test,然后在新建的类里面,没个测试的方法明应以test开头
 * 2.右击run as Junit test 可以执行所有的测试用例,在左侧的视图栏里面可以看到,一些信息
 * 3.执行单个的测试用例可以在编辑框里选中然后右击run as Junit test,
 * 也可以执行上一部,然后在右侧就会有这个测试类的树状图选中一个点击run
 * 4.可以使用eclipse快速生成某一个类的所有测试方法.选中要测试的类,然后改src为test然后next选择要测试的方法
 * 注意,测试方法必须使用public void的形式,且不能带有参数
 * @author rocky
 *
 */
public class CalculateTest
{
    @Test
    public void testAdd()
    {
        assertEquals(6, new Calculate().add(3, 3));
    }

    @Test
    public void testSubtract()
    {
     assertEquals(3, new Calculate().subtract(6,3));   
    }
    @Test
    public void testDivide()
    {
        assertEquals(12, new Calculate().divide(12, 1));
    }
    @Test
    public void testMultiply()
    {
        assertEquals(12, new Calculate().multiply(3, 4));
    }
}


















