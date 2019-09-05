package com.polymorphism;

public class Audi extends Car {
String type;
Audi()
{
	
}
Audi (String colour, String name,String type)
{
	super(colour,name);
	this.type=type;
	
}
@Override
void move(String location)
{
	System.out.println();
}
}
