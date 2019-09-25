package com.equals;

public class A1 {
	String s;
	int j;
    A1()
    {
    	
    }
	 A1(String s,int j)
	{
		this.s=s;
		this.j=j;
	}
	 
	public boolean equals(Object ob)
	{
		A1 temp= (A1)ob;
		return this.s.equals(temp.s) && this.j==temp.j;
	}
}
