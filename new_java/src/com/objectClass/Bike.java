package com.objectClass;

public class Bike extends Vehicle {
	
	double mileage;
	String name;
	
	Bike()
	{
		
	}
	Bike(String colour,int vno,double mileage,String name)
	{
		super(colour,vno);
	this.mileage=mileage;
	this.name=name;
	}
	
	public String toString()
	{
		return super.toString()+" mileage:"+mileage+" name: "+name;
	}

}
