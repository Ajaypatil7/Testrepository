package com.threadprograms;

public class R {
public static void main(String[] args) {
	
	Runnable r1= () ->{
		for(int i=0;i<3;i++)
		{
			System.out.println("from r1");
		}
	};
	Runnable r2= () ->{
		for(int i=0;i<3;i++)
		{
			System.out.println("from r2");
		}
	};
	
	Thread t1=new Thread(r1);
	Thread t2= new Thread(r2);
	
	t1.run();
	t2.run();
	
}
}
