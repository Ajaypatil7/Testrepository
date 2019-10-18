package com.scannerprograms;

import java.util.Scanner;

public class PrimeNumber {
static int a;
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				
				System.out.println("Entered Number is not a prime Number");
				break;
			}
			else
			{
				a=10;
				
			}
			}
			if(a==10)
			{
				System.out.println("Entered Number is a Prime Number");
			}
		}
	}

