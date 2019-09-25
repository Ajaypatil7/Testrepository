package com.exceptions;

public class C7 {

	public static void main(String[] args)throws ClassNotFoundException {
		System.out.println(1);
		Class.forName("java.util.Scanner");//if FQCN is wrong then exception will occur and is unhandled
		System.out.println(2);
	}

}
