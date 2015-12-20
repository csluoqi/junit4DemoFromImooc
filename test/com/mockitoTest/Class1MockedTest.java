package com.mockitoTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.InOrder;

/**
 * 使用mockito大致可以划分为以下几个步骤：

①    使用 mockito 生成 Mock 对象；

②    定义(并非录制) Mock 对象的行为和输出(expectations部分)；

③    调用 Mock 对象方法进行单元测试；

④    对 Mock 对象的行为进行验证。

现在用一个例子来简单呈现以上的步骤：

　　首先静态导入mockito的方法：
 * @author rocky
 *
 */
public class Class1MockedTest
{
    @Test
    public void testMockMethod()
    {
        //定义mockito生成mock对象
        Class1Mocked obj = mock(Class1Mocked.class);
        
        when(obj.hello("z3")).thenReturn("hello 14");
        String actual = obj.hello("z3");
        assertEquals("hello 14", actual);
        //验证
        verify(obj).hello("z3");
    }
    
    @Test
    public void testMockMethodInorder(){
        Class1Mocked objOther = mock(Class1Mocked.class);
        Class1Mocked objCn = mock(Class1Mocked.class);
        
        when(objOther.hello("z3")).thenReturn("hello 14");
        when(objCn.hello("z3")).thenReturn("hello 张三");
        
        String other = objOther.hello("z3");
        assertEquals("hello 14", other);
        
        String cn = objOther.hello("z3");
        assertEquals("hello 张三", cn);
        
        InOrder inorder = inOrder(objOther,objCn);//次行并不决定顺序
        
        inorder.verify(objOther);
        inorder.verify(objCn);
                
    }
    
    @Test
    public void testSkipExpect(){
        Class1Mocked obj = mock(Class1Mocked.class);
        assertEquals(null, obj.hello("z3"));
        obj.show();
        verify(obj).hello("z3");
        verify(obj).show();
    }
}
