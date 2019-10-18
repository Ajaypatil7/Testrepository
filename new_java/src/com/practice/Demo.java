package com.practice;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
System.out.println("Enter the String");
String s=sc.nextLine();

int count=0;
System.out.println("Entered String is: "+s);

for(int i=0;i<s.length();i++)
{
	char ch=(s.charAt(i));
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		count++;
	}
	
}
System.out.println(count);



}
}
