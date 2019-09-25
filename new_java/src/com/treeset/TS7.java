package com.treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class TS7 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("ABC",2);
		Employee e2 = new Employee("XYZ",1);
		Employee e3 = new Employee("LMN",3);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 to sort the employees by name");
		System.out.println("Enter 2 to sort the employees by id");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: TreeSet<Employee> emp = new TreeSet<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		System.out.println(emp);
		break;
		
		case 2: TreeSet<Employee> emp1 = new TreeSet<>(new SortById());
		emp1.add(e1);
		emp1.add(e2);
		emp1.add(e3);
		System.out.println(emp1);
		break;
		
		default: System.out.println("Invalid input");
		break;
		}
		
	}
}
