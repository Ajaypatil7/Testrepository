package com.threadprograms;

import java.util.Scanner;

public class EvenAddScanner {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int input= sc.nextInt();
	
	if(input%2==0)
	{
		System.out.println("Number is even !!!!!");
	}
	else
	{
		System.out.println("Number is odd !!!!!!!");
	}
	
}
}
