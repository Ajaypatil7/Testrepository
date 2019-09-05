package com.abstraction2;

public class AA implements I4,I5 {
	
	@Override
public void test1()
{
	System.out.println("test1() of I4 implemented in A");
}

	@Override
public void test2()
{
	System.out.println("test2() of I5 implemented in A");
}

}
