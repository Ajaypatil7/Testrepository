package com.equals;

public class A2 extends A1 {
char ch;
A2(String s,int j,char ch)
{
	this.s=s;
	this.j=j;
	this.ch=ch;
}

public boolean equals (Object ob)
{
	A2 temp=(A2)ob;
	return super.equals(temp) && this.ch==ch;
}
public static void main(String[] args) {
	A1 ob1 = new A1("ABC",10);
	A1 ob2 = new A1("ABC",10);
	System.out.println(ob1.equals(ob2));
	A2 ob3 = new A2("XYZ",10,'a');
	A2 ob4 = new A2("XYZ",20,'b');
	System.out.println(ob2.equals(ob4));
}
}
