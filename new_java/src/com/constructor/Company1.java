package com.constructor;

public class Company1 {
	

	public static void main(String[] args) {
		 Laptop c1=new Laptop("Acer", 2, "i3");
		 Laptop c2=new Laptop("Lenovo", 4, "i5");
		 Laptop c3=new Laptop("Dell", 6, "i3");
		 System.out.println("brand:"+c1.brand+"  ram:"+c1.ram+"processor:"+c1.processor);
		 System.out.println("brand:"+c2.brand+"  ram:"+c2.ram+"processor:"+c2.processor);
		 System.out.println("brand:"+c3.brand+"  ram:"+c3.ram+"processor:"+c3.processor);
	}
	
		 
}
