package com.exceptions;

public class CE9 {

	static void test()throws ClassNotFoundException
	{
		Class.forName("java.util.Scanner");	
	}

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("from main");
		try {
				test();
		}
		catch(ClassNotFoundException e)
		{
		System.out.println("main ends");
		}
	}

}
