package com.nonstaticmembers;

public class Ns1 {
	
		{
			System.out.println("from IIB-1");
	}
	public static void main(String[] args) {
	System.out.println("frpm main");
		Ns1 ob=new Ns1();
		System.out.println(new Ns1());

	}

}
