package com.staticmembers;

public class S7 {
static int a=20;
	public static void main(String[] args) {
		int a=30;
System.out.println(a); //referring to a local variable
		System.out.println(S7.a);//referring to static variable
		System.out.println(S6.a);//referrring to S6 class
		
	}

}
