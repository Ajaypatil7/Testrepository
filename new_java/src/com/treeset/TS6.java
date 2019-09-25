package com.treeset;

import java.util.TreeSet;

public class TS6 {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts= new TreeSet<>();
		
		ts.add(40);
		ts.add(20);
		ts.add(30);
	//	ts.add("hello");//CTE Because Generic type
		System.out.println(ts);

	}
}
