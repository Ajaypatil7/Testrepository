package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Iterator;
public class Company {
	
	public static void main(String[] args) {
		ArrayList<Employee1> employee=new ArrayList();
		employee.add(new Employee1(1,12.0));
		Employee1 e1= new Employee1(2,8.8);
		employee.add(e1);
		employee.add(new Manager(3,14.4,"Finance"));
		System.out.println(employee);
		//Accessing individual objects of the array list using get()
		
		for(int i=0;i<employee.size();i++)
		{
			Employee1 emp = employee.get(i);
			System.out.println("id is :" +emp.id);
			System.out.println("salary is :"+emp.salary);
			if(emp instanceof Manager)
			{
			Manager manager= (Manager)emp;
			System.out.println("domain is:"+manager.domain);
			}
			System.out.println("****************");
		
			}
			//Accessing individual object using for each
			for(Employee1 empl:employee)
			{
				System.out.println(empl.id);
				System.out.println(empl.salary);
			  if(empl instanceof Manager)
			
				  System.out.println(((Manager) empl).domain);
			  System.out.println("##############");
		}	
			//Accessing using iterator()
			Iterator t = employee.iterator();
			while(t.hasNext())
			{
			       Employee1 emp = (Employee1)t.next();
			       
				System.out.println(emp.id);
				System.out.println(emp.salary);
				if(emp instanceof Manager )
				{
					Manager man=(Manager)emp;
					System.out.println(man.domain);
				}
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
			}
	}
}
