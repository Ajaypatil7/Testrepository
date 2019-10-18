package com.scannerprograms;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	long l=sc.nextLong();
	
	long reverse=0;
	
	while(l!=0)
	{
		long num=l%10;
		reverse=reverse*10+num;
		num=num/10;
	}
	System.out.println(num);
}
}
