package com.inheritance;

public class HomeLoan extends Loan {
     String place;
     
     HomeLoan(String type,double roi,int tennure,String place)
		{
			super(type,roi,tennure);
			this.place=place;
		}
     
	public static void main(String[] args) {
		
		HomeLoan h1=new HomeLoan("Home",9.0,1,"Bangalore");
		System.out.println("type:"+h1.type+" roi:"+h1.roi+" tennure:"+h1.tennure+" place:"+h1.place);
		h1.interest(1500);
		
	    System.out.println("Amount with interest:"+h1.amount);
	
		
			
		}
		

	}


