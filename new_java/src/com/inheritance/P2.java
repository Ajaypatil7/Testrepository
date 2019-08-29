package com.inheritance;

public class P2 extends P1 {
int j=20;
{
	
	System.out.println("From IIB of P2");
}
P2()
{
	System.out.println("From P2()");
}
	public static void main(String[] args) {
		System.out.println("From Main");
		P2 obj1=new P2();
				System.out.println(obj1);
		System.out.println("i:"+obj1.i+" j:"+obj1.j);

	}

}
