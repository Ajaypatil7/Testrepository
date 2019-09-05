package com.polymorphism;

public class B extends A {
void test()
{
	System.out.println("from test() of B");
}
public static void main(String[] args) {
	
	A[] array = {new A(), new B(), new A(), new B()};
	
	for(A b : array )
	{
		b.test();
	  
	}
	
	
	
	// if want to use for loop then below steps
	/*for (int i=0; i<array.length; i++)
	{
		array[i].test();
		System.out.println("__________");
	}*/
}

}
