package com.nonstaticmembers;

public class Employ {
	String id;
	static int countEmployee;
		String name;
		
	{
		 countEmployee++;
		id="TY"+countEmployee;
	}
	
	Employ()
	{
		System.out.println("From Employ()");
	}
	Employ(String name)
	{
     this.name=name;
	}
	
	public static void main(String[] args) {
	
		Employ e1 = new Employ();
		System.out.println(e1.name+"has"+e1.id+"as id");
		Employ e2 = new Employ("sara");
		System.out.println(e2.name+"has"+e2.id+"as id");
		
		System.out.println("the no. of employees are:"+countEmployee);
	}

}
