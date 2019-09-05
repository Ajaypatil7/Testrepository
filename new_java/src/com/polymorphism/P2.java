package com.polymorphism;

public class P2 extends P1{


		void bulletPrakash()
		{
			System.out.println("from bulletprakash of P2");
		}
		
		static void kLRahul()
		{
			System.out.println("from kLRahul in P2");
		}
	
public static void main(String[] args) {
	
	P1.kLRahul();
	P2.kLRahul();
	P1 ob1 = new P2();
	ob1.kLRahul();
	ob1.bulletPrakash();
	P1 ob2= new P1();
	ob2.kLRahul();
	ob2.bulletPrakash();
	P2 ob= new P2();
	ob.kLRahul();
	ob.bulletPrakash();


	}

}
