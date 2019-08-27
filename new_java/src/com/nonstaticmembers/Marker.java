//Write a program to design a class representing an entity known as marker having the following properties.
//1. colour 2.name 3. length double 4. price int.
package com.nonstaticmembers;

public class Marker {
	String colour;
	String name;
	double length;
	int price;
	void initialize(String colour, String name, double length, int price )	{
		this.colour=colour;
		this.name=name;
		this.length=length;
		this.price=price;
		System.out.println("colour:"+this.colour);
		System.out.println("name:"+this.name);
		System.out.println("length:"+this.length);
		System.out.println("price:"+this.price);
	}
	public static void main(String[] args) {
	
		Marker ob=new Marker();
		ob.initialize("Red", "Parker", 3.4, 50);
		System.out.println("colour:"+ob.colour+" name:"+ob.name+" length:"+ob.length+" price:"+ob.price);
		ob.initialize("Black", "Cello", 3.5, 100);
	}
}
