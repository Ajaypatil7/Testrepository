package com.treeset;

import java.util.TreeSet;

public class TS2 {
	public static void main(String[] args) {
		
		TreeSet ts= new TreeSet();
		
		ts.add(40);
		ts.add(20);
		ts.add(30);
		ts.add(20);
		//ts.add(null);  //NullPointerException
		System.out.println(ts);

	}
}
