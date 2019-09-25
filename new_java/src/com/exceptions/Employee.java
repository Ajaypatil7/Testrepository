package com.exceptions;

import java.util.Scanner;

public class Employee {
	int salary;
 void readSalary() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the new salary");
	int salary=sc.nextInt();
	if (salary<=this.salary)
	{
		System.out.println("invalid salary");
		try {
			
		throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			readSalary();
		}
			}
	else
		this.salary=salary;
}
 
 public Employee(int salary)
{
	 this.salary=salary;
	 
}
 
 	 public static void main(String[] args) {

	Employee e=new Employee(1000);
	System.out.println("Employee salary is "+e.salary);
	e.readSalary();
	System.out.println("Raised salary is "+e.salary);
}
}
