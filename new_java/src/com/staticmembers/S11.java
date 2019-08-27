package com.staticmembers;

public class S11 {
static int a=20;
static void test()
{
	int a=10;
	System.out.println(a);//local
}
	public static void main(String[] args) {
		System.out.println(a);//global static variable a
		System.out.println(S11.a);//global static variable a
		test();
		System.out.println(a);//global static variable a

	}

}
