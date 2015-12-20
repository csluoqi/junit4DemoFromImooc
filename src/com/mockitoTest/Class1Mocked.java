package com.mockitoTest;

public class Class1Mocked
{
    public String hello(String name)
    {
        System.out.println("hello " + name);
        return "hello " + name;
    }
    public void show()
    {
        System.out.println("Class1Mocked.show()");
    }
}
