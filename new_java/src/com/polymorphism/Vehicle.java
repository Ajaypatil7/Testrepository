package com.polymorphism;

public class Vehicle {
String vehicleNumber;
String colour;
static int count;
Vehicle()
{
	
	++count;
vehicleNumber=" MH "+count;
}

Vehicle(String colour)
{
	this();
	this.colour = colour;
}
 void move()
{
	 System.out.println("Vehicle is moving !!!!!!!");
	
}
 void move(String location)
 {
	 System.out.println("Vehicle is moving towards:" +location);
	 
 }
 
 
}

// =    +