package com.constructor;

public class P7 {
      int i;
      P7()
      {
    	 i=10; 
      }
	public static void main(String[] args) {
		P7 p1=new P7();
		P7 p2=new P7();
		P7 p3=new P7();
		
		System.out.println("i value for my 1st object is:"+p1.i);
		System.out.println("i value for my 2nd object is:"+p2.i);
		System.out.println("i value for my 3rd object is:"+p3.i);
	}

}
