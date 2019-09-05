package com.abstraction2;

public class MainClass {
	
	
	public static void main(String[] args) {
		//	In1 ob1 = new In1();//can't instantiated an interface and interface doesn't have constructor
			
			In1 ob2; // can create reference variable of an interface
			
			In1 ob3= new ImC();     // ImC is concrete hence can be instantiated // abstraction is done by passing parent 
			                       //interface In1 instead of class ImC.
			ob3.test();
		}
}// WebDriver driver = new RemoteWebDriver();

