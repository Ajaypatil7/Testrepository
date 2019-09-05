package com.abstraction2;

public class B implements I1{
public void test()
{
	System.out.println("test() of I1 implemented in subclass B");
}

public int test1()
{
	System.out.println("test1() of I1 implemented in subclass B");
	return 100; //any value
}
}//B is an implementation of I1
