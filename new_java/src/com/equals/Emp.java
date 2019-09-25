package com.equals;

public class Emp {
	String name;
	int id;
	Emp()
	{
	}
	Emp(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
public String toString()
{
	return "name:"+name+" id:"+id;
}
public boolean equals(Object ob)
{
	Emp temp= (Emp)ob;
	return this.name.equals(temp.name) && this.id==temp.id;
	
}
}
