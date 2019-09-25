package com.arraylistprograms;

public class Resume implements Comparable<Resume>{
	String name;
	int yop;
	double percentage;
	
	Resume(){
		
	}
	 Resume(String name, int yop, double percentage) {
		this.name = name;
		this.yop = yop;
		this.percentage = percentage;
	}
	public int compareTo(Resume res)
	{
		if(this.yop>res.yop)
			return 1;
		if(this.yop<res.yop)
			return -1;
		else
			return 0;
	}

}
