package com.inheritance;

public class Road {

	public static void main(String[] args) {
        Car c1=new Car("red",7797,"Benz");
        System.out.println("colour:"+c1.colour);
        System.out.println("v_no:"+c1.v_no);
        System.out.println("brand:"+c1.brand);
        
        Vehicle v1=new Vehicle("Black",2020);
        System.out.println("colour:"+v1.colour);
        System.out.println("v_no:"+v1.v_no);
		
	}
}
