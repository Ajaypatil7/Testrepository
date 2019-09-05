package com.polymorphism;

public class Car extends Vehicle {
String name;
Car()
{
	
}
public Car(String colour,String name)
{
	super(colour);
	this.name =name;
	}
void move()
{
	System.out.println("The"+colour+" colour car is Moving!!!!!");
}
}
