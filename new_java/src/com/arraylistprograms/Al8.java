package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Al8 {

	public static void main(String[] args) {
		
		//Using generic ArrayList
		ArrayList<Integer> ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		
		//Accessing the objects using iterator
		Iterator<Integer> t=ls.iterator();
		while(t.hasNext())
		{
			int i=t.next();
			System.out.println(i);
		}
	}
}
