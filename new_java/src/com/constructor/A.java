package com.constructor;

public class A {
		A()
		{
			System.out.println("from a()");
		}
		A(int i)
		{
			this();
			
			System.out.println("From A(int)");
		}
	public static void main(String[] args) {
		A ob1=new A();// from A()
		System.out.println("__________");
		A ob2 = new A(10);// from A() // from A(int)
		

	}

}
