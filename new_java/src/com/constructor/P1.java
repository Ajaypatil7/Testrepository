package com.constructor;

public class P1 {
	P1()//User defined non-parameterised constructor
	{
		System.out.println("from constructor of P1");
	}
	public static void main(String[] args) {
		System.out.println("from main"); 
		P1 ob = new P1();
		System.out.println(new P1());// It will execute the constructor 1st during the object creation and then it will return the address
		
	}

}
