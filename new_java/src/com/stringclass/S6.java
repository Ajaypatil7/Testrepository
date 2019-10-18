package com.stringclass;

public class S6 {
public static void main(String[] args) {
	String s1="hello";
	String s2="hello";
	String s3="hello";
	String s4="Hello";
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
	
	System.out.println(s1==s2);
	System.out.println(s2==s3);
	System.out.println(s1==s3);
	System.out.println(s1==s4);
}
}
