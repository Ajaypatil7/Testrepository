package com.pac2;
import com.pac1.Q1;

public class Q4 {

	public static void main(String[] args) {
     System.out.println(Q1.i); // i is having default access specifier so not visible
     Q1 ob = new Q1(); //Q1 is default constructor which is public  
      System.out.println(ob.j);// j is having default acc specifier hence not visible 

	}

}
