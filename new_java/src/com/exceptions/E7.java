package com.exceptions;

public class E7 {
	public static void main(String[] args) {
		System.out.println(1);
		int a=10, b=1;  //value of b is changed 
		int c;
		System.out.println(2);
		
		try {
			c=a/b;  //exception will not occur bcoz 10/1=10 therefore exception will not occur
			        // and the execution of catch will not happen
			
			System.out.println(3); //this statement will also execute because the exception is not occured
		}
		
       catch(ArithmeticException e)
       {
    	System.out.println("cought");   
       }
		
		System.out.println(4);
	}

}
