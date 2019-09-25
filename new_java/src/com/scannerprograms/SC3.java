package com.scannerprograms;

import java.util.Scanner;


// program to take 5 names and display them
public class SC3 {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	String[] names= new String[5];
	for(int i=0;i<names.length;i++)
	{
		System.out.println("enter name");
		names[i]=sc.next();	
	}
	for(String name:names)
	{
		System.out.println(name);
	}
	
	
	
	/*for(int i=0;i<5;i++)
	{
		System.out.println("Enter the name ");
	}
	*/
	



}
}
