package com.hashsetprograms;
import java.util.HashSet;

public class Hs1 {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	System.out.println(hs.size());//0
	System.out.println(hs.isEmpty());//true
	hs.add(10);
	hs.add(20);
	hs.add("hello");
	hs.add(10.9);
	System.out.println(hs);  //[10,10.9,10,hello]//order of insertion not maintained
	hs.add(null);//null allowed
	hs.add(10);//duplicate not allowed
	System.out.println(hs);//[null, 20, 10.9, 10, hello]
	hs.remove(10.9);
	System.out.println(hs);
	System.out.println(hs.contains(10.9));//false
	hs.clear();
	System.out.println(hs);
}
}
