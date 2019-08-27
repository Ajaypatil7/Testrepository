package com.constructor;

public class Laptop {
	
	String brand;
    double ram;
    String processor;
    
    Laptop()
    {
  		System.out.println("brand:"+brand+"  ram:"+ram+"processor:"+processor);
    }
    Laptop(String brand, double ram, String processor)
    {
  	this.brand=brand;
  	this.ram=ram;
  	this.processor=processor;
    }
     	

}
