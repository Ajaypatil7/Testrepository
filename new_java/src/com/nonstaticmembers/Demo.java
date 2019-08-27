package com.nonstaticmembers;

public class Demo {
	static int i=10;
	int j=20;
	{
		System.out.println(i);
		
		}
	Demo()
	{
		System.out.println();
	}
		public static void main(String[] args) {
			
			Ns2 ob=new Ns2();
			
			System.out.println("main ends");	
		}
		
				
		

	}


