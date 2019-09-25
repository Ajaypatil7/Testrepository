package com.arraylistprograms;

import java.util.ArrayList;

public class MainClass {
public static void main(String[] args) {
	
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add("AJAY");
		ls.add(new Bike("Black",28.5));
		ls.add(new Employee(1,12.4));
		ls.add(new Student(7,10));
		
		System.out.println(ls);
		for(int i=0;i<ls.size();i++)
		{
			Object ob=ls.get(i);
			System.out.println(ob);
		}
		for(Object ob:ls)
		{
			System.out.println(ob);
		}
		}

}
