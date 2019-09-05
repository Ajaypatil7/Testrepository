package com.inheritance;



public class Road1 {
	
	 public static void display(Vehicle1 x)
	 {	
		  System.out.println("colour is:"+x.colour);
		 if(x instanceof TwoWheeler)
			 System.out.println(((TwoWheeler)x).name);
		 if(x instanceof Bike)
             System.out.println(((Bike)x).mileage);
		 System.out.println("___________");
	 }
	 
	public static void main(String[] args) {
		
	     Bike b1=new Bike("Black","R15",49.8);
	     TwoWheeler tw1=new TwoWheeler("Red","Royal Enfield");
	     Vehicle1 v1=new Vehicle1("Green");
	     Bike b2= new Bike("Blue","Unicorn",52.7);
	     
	     display((Vehicle1)b1); //Down casting is done here itself 
	     display(tw1);
	     display(v1);
	     display(b2);
	
	}
}
