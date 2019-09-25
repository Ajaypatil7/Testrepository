package com.treeset;

import java.util.TreeSet;

public class TS5 {
	public static void main(String[] args) {
		
		TreeSet ts= new TreeSet();
		
		ts.add(true);
		ts.add(10>20);
		//ts.add(20); //ClassCastException

		System.out.println(ts);

	}
}
