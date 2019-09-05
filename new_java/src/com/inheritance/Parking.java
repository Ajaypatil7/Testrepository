package com.inheritance;

public class Parking {

	 
			public static void main(String[] args) 
			{
				Vehicle1 []v = new Vehicle1[5];
			     v[0]=new Bike("Black","R15",49.8);
			     v[1]=new TwoWheeler("Red","Royal Enfield");
			     v[2]=new Vehicle1("Green");
			     v[3]= new TwoWheeler("Blue","Scooty");
			     v[4]= new Bike("Blue","Unicorn",52.7);
			    
			  for(Vehicle1 x:v)
				 {	
					  System.out.println("colour is:"+x.colour);
					 if(x instanceof TwoWheeler)
						 System.out.println(((TwoWheeler)x).name);
					 if(x instanceof Bike)
			             System.out.println(((Bike)x).mileage);
					 System.out.println("********");
				 }
				 

	}

}
