package com.rough;

public class ShapeArea {
public static void main(String[] args) {
	
	I1 circle= (int x) -> {
		double circleArea= 3.14*x*x;
		System.out.println("Area of circle is :"+circleArea);
	};
	I1 square=(int x)->{
		int squareArea=x*x;
		System.out.println("Area of square is :"+squareArea);
	};
	circle.area(5);
	square.area(10);
}
}
