package com.stringclass;

public class ATE extends Employee {
String tool;
double salary;

ATE()
{}
ATE(String name,int id,String tool,double salary)
{
	super(name,id);
	this.tool=tool;
	this.salary=salary;
	}

public String toString()
{
	return super.toString()+ " tool:"+tool+" salary:"+salary;
}

public boolean equals(Object ob)
{
	ATE temp=(ATE) ob;
	return super.equals(ob) && this.salary==temp.salary  &&  this.tool.equals(temp.tool);
}

public int hashCode()
{
	int hc=0;
	hc=(int)salary+tool.hashCode()+super.hashCode();
	return hc ;
}



}
