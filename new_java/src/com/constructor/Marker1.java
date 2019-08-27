package com.constructor;

public class Marker1 {
	String colour;
	double length;
	Marker1(String colour, double length)
	{
		this.colour=colour;
		this.length=length;
	}
public static void main (String []args)
{
	Marker1 m1=new Marker1("Black",3.5);
	
	System.out.println("colour:"+m1.colour+"  length:"+m1.length);
}

}
