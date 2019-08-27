package com.constructor;

public class Animal {
	
    double height;
    double weight;
    
    Animal()
    {
  		System.out.println("brand:"+height+"  ram:"+weight);
    }
    Animal( double height, double weight )
    {
  	this.height=height;
  	this.weight=weight;
    }
}

