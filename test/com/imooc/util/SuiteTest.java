package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 1测试套件就是组织测试类一起运行的
 * 写一个作为测试套件的入口类,这个类里面不包含其他的方法
 * 更改测试运行器Suite.class
 * 将要测试的类作为数组传到Suite.SuiteClass({})
 * 测试运行器可以嵌套
 * @author rocky
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class,TaskTest2.class,TaskTest3.class})
public class SuiteTest
{//不能包含任何内容,且是public
    }
