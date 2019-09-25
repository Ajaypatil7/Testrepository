package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Interview {
public static void main(String[] args) {
	ArrayList<Resume> resume= new ArrayList<>();
	
	resume.add(new Resume("shaista",2019,75.0));
	resume.add(new Resume("Prasanna",2018,65));
	resume.add(new Resume("Ajay",2020,64));
	resume.add(new Resume("Pawan",2017,85.0));
	
      for(int i=0;i<resume.size();i++)
      {
    	  System.out.println("name: "+resume.get(i).name);
    	  System.out.println("yop: "+resume.get(i).yop);
    	  System.out.println("percentage: "+resume.get(i).percentage);
      }
      
      System.out.println("_________________");
	//After Sorting on the basis of yop
      
	Collections.sort(resume);
	Iterator<Resume> t1 = resume.iterator();
	while(t1.hasNext())
	{
		Resume res = t1.next();
		System.out.println("name: "+res.name+" yop: "+res.yop+" percentage: "+res.percentage);
	}
	System.out.println("^^^^^^^^^^^^^^^^^^^^");
Collections.sort(resume,new SortByPercentage());
Iterator<Resume> t2 = resume.iterator();
while(t2.hasNext())
{
	Resume res = t2.next();
	System.out.println("name: "+res.name+" yop: "+res.yop+" percentage: "+res.percentage);
}
	



}
}
