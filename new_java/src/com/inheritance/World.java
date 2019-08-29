package com.inheritance;

public class World {

	public static void main(String[] args) {
		Dog d1=new Dog(25.0,30.0,"Golden Retrerian");
		Dog d2=new Dog(25.0,30.0,"Doberman");
		Dog d3=new Dog(25.0,30.0,"Labrodog");
		Dog d4=new Dog(25.0,30.0,"German Shefard");
		
		System.out.println("height="+d1.height+ " weight="+d1.weight+" breed="+d1.breed);
		System.out.println("height="+d2.height+ " weight="+d2.weight+" breed="+d2.breed);
		System.out.println("height="+d3.height+ " weight="+d3.weight+" breed="+d3.breed);
		System.out.println("height="+d4.height+ " weight="+d4.weight+" breed="+d4.breed);
				

	}

}
