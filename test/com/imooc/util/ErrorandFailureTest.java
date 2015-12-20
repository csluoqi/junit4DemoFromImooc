package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 1.Failure 一般由单元测试使用的断言方法判断失败所引起的,这表示测试点发现了问题
 * 就是说程序输出的结果何我们预期的不一样.
 * 2.error是由代码异常引起的,他可以产生测试代码本身的错误,也可以是被测试代码中的一个隐藏的bug
 * 3.测试用例不是用来证明你是对的,而是用来证明你没有错误
 * @author rocky
 *
 */
public class ErrorandFailureTest
{
    @Test
    public void testAdd()
    {
      assertEquals(5, new Calculate().add(5, 12));
    }
    @Test
    public void testDivide()
    {
        assertEquals(1, new Calculate().divide(1, 0));
    }
}
