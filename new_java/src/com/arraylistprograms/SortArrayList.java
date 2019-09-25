package com.arraylistprograms;

import java.util.ArrayList;

import java.util.Collections;

public class SortArrayList {

	
	public static void main(String[] args) {
		ArrayList<Integer> ls= new ArrayList();
		ls.add(100);
		ls.add(400);
		ls.add(300);
		ls.add(200);
		System.out.println("Before Sorting ");
		System.out.println(ls);//Before Sorting 
		
		Collections.sort(ls);
		System.out.println("After Sorting");
	
		System.out.println(ls);
	}
}
