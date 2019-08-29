package com.inheritance;

public class Dog extends Animal {
String breed;
	void sniff()
	{
		System.out.println("Dog Sniffs");
	}
	Dog()
	{
		
	}
	Dog(double height,double weight,String breed)
	{
		super(height,weight);
		this.breed=breed;
	}

}
