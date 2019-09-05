package com.methodoverriding;

public class Company {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.work();
		Developer d1= new Developer();		
		d1.work();
		
		Tester t1= new Tester();
		t1.work ();
		

	}

}
