package com.staticmembers;

public class S14 {
static int i=10;
static {
	int i=20;
	System.out.println(i);
	System.out.println(S14.i); 
	
}
public static void main(String []args)
{
	System.out.println(i);
}
}
