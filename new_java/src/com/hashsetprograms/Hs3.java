package com.hashsetprograms;

import java.util.HashSet;
import java.util.Iterator;

public class Hs3 {
public static void main(String[] args) {
	
	HashSet hs =new HashSet();
	
hs.add(10);
hs.add(20);
hs.add(0);
hs.add(40);

Iterator<Integer> i=hs.iterator();
while(i.hasNext())
{
	Integer i2=i.next();
	System.out.println(i2);
}
	
	
	
	}


}

