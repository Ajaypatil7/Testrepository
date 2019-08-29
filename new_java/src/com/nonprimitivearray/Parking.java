package com.nonprimitivearray;

public class Parking {

	public static void parking(Bikes [] parking)
	{
		for(Bikes b: parking)
		{
			System.out.println(b.brand);
			System.out.println(b.milege);
			System.out.println(b.colour);
			System.out.println("_________________");
		}
	} 
	public static void main(String[] args) {

				Bikes [] b = new Bikes[5];
				   b[0] = new Bikes("Royal Enfield",55.3,"Black");
				   b[1] =  new Bikes("Dominer",52.0,"Red");
				   b[2] = new Bikes("CBR",42.7,"White");
				   b[3] = new Bikes("R15",67,"Black");
				   b[4] = new Bikes("Unicorn",38.2,"A.R. Rehman");
				   
				  parking(b);
				 
	   }

}

