package com.stringclass;

public class Employee {
String name;
int id;
Employee()
{}
Employee(String name,int id)
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
	Employee temp=(Employee) ob;
	return this.id==temp.id  &&  this.name.equals(temp.name);
}

public int hashCode()
{
	int hc=0;
	hc=id+name.hashCode();
	return hc ;
}




}
