package com.arraylistprograms;

import java.util.ArrayList;

public class Al3 {
public static void main(String[] args) {
	
	ArrayList ls= new ArrayList();
	ls.add(10);
	ls.add("hello");
	ls.add(new Bike("red",10.9));
	Bike b=new Bike("Black",29.9);
	ls.add(b);
	System.out.println(ls);
	
}
}
