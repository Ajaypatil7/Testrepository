package com.arraylistprograms;

import java.util.ArrayList;

public class Al5 {
public static void main(String[] args) {
	
	ArrayList ls=new ArrayList();
	ls.add(10);
	ls.add("Hello");
	ls.add(new Bike("Red ", 10.9));
	Bike b= new Bike("Black",29.9);
	
	for(int i=0;i<ls.size();i++)
	{
		Object ob=ls.get(i);
		if(ob instanceof Integer)
		{
			Integer i1=(Integer)ob;
			int i2=i1;
			System.out.println(i2);
			System.out.println(i2+10);
		}
		
		System.out.println(ob);
		if(ob instanceof Bike)
		{
			Bike b2=(Bike)ob;
			b2.colour="violet";
			System.out.println(b2.colour);
		}
		
	}
}
} 
