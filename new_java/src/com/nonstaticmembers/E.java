package com.nonstaticmembers;

public class E {
		
		int i;
		int j;
		E()
		{
		
		}
        E(int i,int j)
        {
        	this.i=i;
        	this.j=j;
        
	    }
        static E generateObject(int i,int j)
        {
        	return new E(i,j);
        }
        E initialize(int i,int j)
        {
        	this.i=i;
        	this.j=j;
        	return this;
        }
        void display()
        {
        	System.out.println("i:"+this.i);
        	System.out.println("j:"+this.j);
        }
      public static void main(String[] args) {
          E ob =E.generateObject(10,20);
          ob.display();
          ob.initialize(100,200).display();
       }
}
