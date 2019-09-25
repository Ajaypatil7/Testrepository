package com.objectClass;

public class A {
int i;

	public static void main(String[] args) {
      A ob1=new A();
      A ob2=new A();
      
      System.out.println(ob1);
      System.out.println(ob2);
      
      System.out.println(ob1.equals(ob1));
      System.out.println(ob1.equals(ob1));
      System.out.println(ob2.equals(ob1));
      System.out.println(ob2.equals(ob2));
        }
}
