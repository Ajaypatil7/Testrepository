package com.abstraction;

public class World {

	public static void main(String[] args) {
	Dog d1=new Dog();
	d1.talk();//functionality is provided by concrete class Dog
	System.out.println("________");
	
     Cat c1=new Cat();
     c1.talk();  // Functionality is provided by concrete class Dog
     System.out.println("___________");
     
     Animal a;
     a=new Dog();
     a.talk();//Functionality is provided by abstract class Animal 
     a=new Cat();
     a.talk();//Functionality is provided by abstract class Animal
	
	

	}

}
