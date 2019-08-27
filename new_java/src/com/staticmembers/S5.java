package com.staticmembers;

public class S5 {
static int a=10;// class static variable
	public static void main(String[] args) {
	  int a=20;//local variable
		System.out.println(a);//referring to local a
        System.out.println(S5.a);
	}

}
