package com.inheritance;

public class Vehicle {
	String colour;
	int v_no;
	void move()
	{
		System.out.println("Vehicle is Moving");
	}
	Vehicle()
	{
	}
	Vehicle(String colour,int v_no)
	{
		this.colour=colour;
		this.v_no=v_no;
		
		}

}
