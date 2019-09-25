package com.stringclass;

public class Company {
	
public static void main(String[] args) {
	   Employee ob1=new Employee("AJAY",1);
	   Employee ob2=new Employee("AJAY",1);
	   System.out.println(ob1);
	   System.out.println(ob2);
	   System.out.println(ob1.equals(ob2));
	   System.out.println(ob1.hashCode());
	   System.out.println(ob2.hashCode());
	   System.out.println("**************");
	   
	   ATE ob3=new ATE("AJAY",1,"Selenium",10.5);
	   ATE ob4=new ATE("AJAY",1,"Selenium",10.5);
	   System.out.println(ob3);
	   System.out.println(ob4);
	   System.out.println(ob3.equals(ob4));
	   System.out.println(ob3.hashCode());
	   System.out.println(ob4.hashCode());
	   System.out.println("**************");
}
}
