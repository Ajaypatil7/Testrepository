package com.hashsetprograms;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;


public class Hs6 {
public static void main(String[] args) {
	
	HashSet<Integer> hs=new HashSet();
	hs.add(10);
	hs.add(20);
	hs.add(0);
	System.out.println("Before");
	System.out.println(hs);
	ArrayList ls = new ArrayList(hs);
	Collections.sort(ls);
	System.out.println("After");
	System.out.println(ls);
}
}
