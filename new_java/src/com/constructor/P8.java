package com.constructor;

public class P8 {
		boolean x;
		double y;
		
		P8(boolean x, double y)
		{
			this.x=x;
			this.y=y;
		}
	public static void main(String[] args) {
		P8 p4=new P8(false ,2.2);
		P8 p5=new P8(true,3.7);
		P8 p6=new P8(false,0.2);
		
		System.out.println("x:"+p4.x+"   y:"+p4.y);
		System.out.println("x:"+p5.x+"   y:"+p5.y);
		System.out.println("x:"+p6.x+"   y:"+p6.y);

	}

}
