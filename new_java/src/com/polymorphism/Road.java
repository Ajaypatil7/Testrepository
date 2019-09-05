package com.polymorphism;

public class Road {

	public static void main(String[] args) {
	Vehicle[] vehicle= new Vehicle[5];
	vehicle[0]= new Vehicle("Red");
	vehicle[1]= new Car("Black","Jaguar");
	vehicle[2]=new Car("Maroon","R8");
	vehicle[3]= new Audi("White","Q6","SUV");
	vehicle[4]= new Audi("Blue","A8","Sedan");
for(Vehicle v:vehicle )
{
	System.out.println("vehicle number"+v.vehicleNumber);
	System.out.println("colour"+v.colour);
	if(v instanceof Car)
	System.out.println("name"+((Car)v).name);
	if (v instanceof Audi)
	System.out.println("type"+((Audi)v).type);
	v.move();
	v.move("Switzerland");
	System.out.println("___________");
	
}
	}

}
