package com.nonprimitivearray;


public class Match {

	
		public static void match(Batsmen [] match)
		{
			for(int i=0;i<match.length;i++)
			{
				System.out.println(match[i].name);
				System.out.println(match[i].average);
				System.out.println(match[i].jerseyNo);
				System.out.println("_________________");
			}
		} 
		public static void main(String[] args) {

					Batsmen [] m1 = new Batsmen[5];
					   m1[0] = new Batsmen("Sourav",55.3,24);
					   m1[1] =  new Batsmen("Steve",59.0,49); 
					   m1[2] = new Batsmen("Yuvraj",42.7,12);
					   m1[3] = new Batsmen("Aryan",52,20);
					   m1[4] = new Batsmen("Ajay",44.2,07);
					   
					  match(m1);
					 

	}

}
