package com.inheritance;

public class Bike extends TwoWheeler {
double mileage;
Bike()
{
	
}

Bike(String colour,String name,double milege)
{
	super(colour,name);
	this.mileage=milege;
	
}
}

