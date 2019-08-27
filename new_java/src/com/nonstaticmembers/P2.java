package com.nonstaticmembers;

public class P2 {
void test()
{
	System.out.println("From test()");
}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		P2 ob1=new P2();//
		ob1.test();
		System.out.println("Main Ends");

	}

}
