package com.constructor;

public class B {
		B()
		{
			this(10);
			System.out.println("from B()");
		}
		B(int i)
		{
			this(); // compile time due to recursion   
			
			System.out.println("From B(int)");
		}
	public static void main(String[] args) {
		B ob1=new B();// from B() from B(int)
		System.out.println("__________");
		B ob2 = new B(10);// from B() 
		

	}

}
