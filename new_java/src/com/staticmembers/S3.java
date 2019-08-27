package com.staticmembers;

public class S3 {
      static int a=20;
	public static void main(String[] args) {
		System.out.println(a); // directly using the member name
		System.out.println(S3.a); // using the class name

	}

}
