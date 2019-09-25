package com.arraylistprograms;

public class Employee {
	int id;
	double salary;
	Employee()
	{}

      Employee(int id,double salary)
	{
		this.id= id;
		this.salary=salary;
	}

	public String toString()
	{
		return " Employee id:"+id+" salary"+salary;
	}

}
