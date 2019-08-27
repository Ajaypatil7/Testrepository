package com.nonstaticmembers;

public class B {
     int i;
       void test()
        {
	     int i =30;
	     System.out.println(i);
	     System.out.println(this.i);
        }
	public static void main(String[] args) {
      B ob1=new B();
      ob1.test();// it will create a frame "test"

      B ob2=new B();
      ob2.i=20;    
      ob2.test();     //it will create a new "test" frame in the stack

	}

}
