//wap to create a class known as vanhuesen shirts(properties like string color, int size, string product code)
//the product code for 1st shirt is van1.  create 2 constructors 1 parameterised and 1 non parameterised
// van2 for 2nd product.


package com.nonstaticmembers;

public class VanheusenShirts {
	String colour;
	static int size;
		String productCode;
		static int count;

		{
		count++;
		productCode="VAN"+count;
	}
	
	VanheusenShirts()
	{
		System.out.println("From vanhausen()");
	}
	VanheusenShirts(String colour, int size)
	{
     this.colour=colour;
     this.size=size;
	}
	
	public static void main(String[] args) {
	
		VanheusenShirts v1 = new VanheusenShirts();
		System.out.println(v1.colour+" has "+v1.size+" as size and product code:"+v1.productCode);
		VanheusenShirts v2 = new VanheusenShirts("Red",32);
		System.out.println(v2.colour+" has "+v2.size+" as size and product code: "+v2.productCode);
		
		System.out.println("the no. of shirts are:"+count);
	}

}

