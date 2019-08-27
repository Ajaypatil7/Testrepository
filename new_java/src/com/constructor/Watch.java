package com.constructor;

public class Watch {
      String type;
      double price;
      
      Watch()
      {
    		System.out.println("type:"+type+"  price:"+price);
      }
      Watch(String type, double price)
      {
    	this.type=type;
    	this.price=price;
    	
      }
}
