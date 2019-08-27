package com.staticmembers;

public class S8 {
static void test()
{
	System.out.println("from test()");
}
	public static void main(String[] args) {
		System.out.println("main begins");
		test();// caling the method directly
		System.out.println("++++++");
		S8.test();// calling the method using the class name 
		System.out.println("main ends");
	}

}
