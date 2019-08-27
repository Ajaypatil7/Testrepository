package com.nonstaticmembers;

public class P3 {
	int i;
	void test()             //called method
{
	System.out.println("From test()");
	System.out.println(i);    //10 it will search locally first and then go to "this" 
	System.out.println("this:"+this);  //P3@100
	i=20;
	System.out.println(this.i);    //20 It will directly go to "this" which has address of the object
	System.out.println("end of test");
}
	
	public static void main(String[] args) { //calling method
		System.out.println("From main");
		P3 ob = new P3();
		ob.i=10;
		ob.test();//calling test()
		System.out.println("ob: "+ob);  //P3@100
		System.out.println("end of main");
	}

}
