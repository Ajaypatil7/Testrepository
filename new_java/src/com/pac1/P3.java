package com.pac1;

public class P3 extends P1{

	public static void main(String[] args) {
		System.out.println(P3.j);
		System.out.println(P3.i);// CTE i is private member of P1 hence not inherited in  subclass P3

		
		
		P3 ob=new P3();
		System.out.println(ob.x);// CTE because x is privatye nonstatic member of class P1
		     						//so it is not inherited in subclass object
	}

}
