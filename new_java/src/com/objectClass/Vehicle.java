package com.objectClass;


public class Vehicle {
	String colour;
	int vno;
	
	Vehicle()
	{
		
	}
	Vehicle(String colour,int vno)
	{
		this.colour=colour;
		this.vno=vno;
	}
	
	public String toString()
	{
		return " colour: "+colour+" vno: "+vno;
	}
	
}
