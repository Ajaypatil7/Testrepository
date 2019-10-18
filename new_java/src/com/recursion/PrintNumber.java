package com.recursion;

public class PrintNumber {

	static void printNum(int n)
	{
		if(n==4)
			return;
		System.out.println(n);
		printNum(++n);//recursive call statement
		System.out.println(n);
	}
	public static void main(String[] args) {
		
		System.out.println("Main Begin");
	    printNum(0);
	    System.out.println("Main Ends");
	}

}
