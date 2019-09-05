package com.inheritance;

public class Employee {
String id;
String name;
double salary;
int count;
void work()
{
	System.out.println("Employee is working");
}

  
	Employee()
	{
		
	}
    Employee(String name,double salary)
    {
    	++count;
    	this.id="testengineer"+count;
    	this.name=name;
    	this.salary=salary;
    }
    	
}
