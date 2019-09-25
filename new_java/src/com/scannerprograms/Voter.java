package com.scannerprograms;

import java.util.Scanner;
public class Voter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter your first name");
	String str1=sc.next();
	
	System.out.println("Enter your last name");
	String str2=sc.next();
	
	System.out.println("Enter your age ");
     int age=sc.nextInt();
     
     if(age>18)
     {
    	 System.out.println(str1+" "+str2+ " is eligible to vote...!!!");
     }
     else
     {
    	 System.out.println(str1+" "+str2+" is not Eligible to vote ...!!!");
     }
     
     
     
     
	}
}
