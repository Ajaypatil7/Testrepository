package com.arraylistprograms;

public class Bike {
	String colour;
	double mileage;
	Bike()
	{}

	Bike(String colour,double mileage)
	{
		this.colour=colour;
		this.mileage=mileage;
	}

	public String toString()
	{
		return " Bike colour:" +colour+ " mileage" +mileage;
	}

}
