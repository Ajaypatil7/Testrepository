package com.inheritance;


public class Car extends Vehicle {
String brand;
	
	Car()
	{
		
	}
	Car(String colour,int v_no,String brand)
	{
		super(colour,v_no);
		this.brand=brand;


}
}