package com.nonstaticmembers;

public class D {
	
	int i;
	public D initialize(int i)
	{
	this.i=i;
	return this;
	}
	public static D createObject()
	{
		return new D();
	}
	
	void display()
	{
		System.out.println("i:"+this.i);
	}
	
	public static void main(String[] args) {
	
	        D.createObject().initialize(10).display();
	}

}
