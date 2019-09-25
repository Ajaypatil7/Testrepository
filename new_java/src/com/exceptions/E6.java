package com.exceptions;

public class E6 {
	public static void main(String[] args) {
		System.out.println(1);
		int a=10, b=0;
		int c;
		System.out.println(2);
		
		try {
			c=a/b;//exception will occur
			System.out.println(3);
		}
		
       catch(NullPointerException e)// exception handaling mechanism is used
		                            //but it is not suitable therefore the program will stop executing
       {
    	System.out.println("cought");  
    	System.out.println(e);
       }
		
		System.out.println(4);
	}

}
