package com.exceptions;

public class E5 {

	public static void main(String[] args) {
		System.out.println(1);
		int a=10, b=0;
		int c;
		System.out.println(2);
		
		try {
			c=a/b;// Exception will occur 
			
			System.out.println(3);//this statement will not execute because the exception occured 
		}
		
       catch(ArithmeticException e)//exception handaling mechanism is used and it is suitable to handle the 
		                           //exception 
       {
    	System.out.println("cought");
    	System.out.println(e);
       }
		
		System.out.println(4);
	}

}
