//create a class named as Exercise and create 
//create one static and one non static variable in class 
//create a non static method  and a static method(main method)
//


package com.nonstaticmembers;

public class Exercise {
       
	static int i;
	int j;
       void test() {
    	   //accessing static inside non-static context
		System.out.println(i); //directly 
		Exercise.i=200; //using class name
		System.out.println(this.i);//using "this"
		
		//System.out.println(Exercise.i); //using class name
		System.out.println(j);//directly
       System.out.println(this.j); //using this
       }
	
	public static void main(String[] args) {
	//accessing staticmembers inside static context
   System.out.println(i); //directly
   Exercise.i=20;
   System.out.println(Exercise.i); //by using class name as reference
   
   //accessing non-static members inside static context
   Exercise ob=new Exercise();
   ob.i=10;//by creating object and using an object reference
   ob.test();
	System.out.println(ob.i);//10
	}
}
