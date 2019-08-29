package com.nonprimitivearray;

public class Song1 {
	
	public static void main(String[] args) {
		Songs [] s = new Songs[7];
		   s[0] = new Songs("Teri-Meri",4.0,"Rahat fateh Ali");
		   s[1] = new Songs("Tagru",4.2,"Anthony Dassan");
		   s[2] = new Songs("Nanaku Prematho",3.0,"DSP");
		   s[3] = new Songs("Malhari",4.5,"Yesedass");
		   s[4] = new Songs("Vande Matram",5.0,"A.R. Rehman");
		   s[5] = new Songs("Ankhya ka Kajal",3,"----");
		   s[6] = new Songs("Senorita",12,"Shawn Mendes");
		   
		   
		   Songs[] song = { new Songs("Teri-Meri",4.0,"Rahat fateh Ali"), new Songs("Tagru",4.2,"Anthony Dassan")};
		      for (Songs s2: s)
		      {
		    	 System.out.println("title:"+s2.title); 
		    	 System.out.println("singer:"+s2.singer);
		    	 System.out.println("duration:"+s2.duration);
		    	 
		      }
	}
	

}
