package com.nonstaticmembers;

public class Ns2 {
	{
		System.out.println("from IIB_1");
	}
	public static void main(String[] args) {
		System.out.println("From main");
		Ns2 ob=new Ns2();
		Ns2 ob1=new Ns2();
		System.out.println("main ends");
		
	}
	
		{
			System.out.println("From IIB-2");//outside the main method
		
	}

}
