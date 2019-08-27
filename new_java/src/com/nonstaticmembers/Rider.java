package com.nonstaticmembers;

public class Rider {
    public static void main(String[] args) {	
				Vehicle v1;
				v1=new Vehicle();
				System.out.println("vehicle name:"+v1.name+" colour:"+v1.colour+" speed "+v1.speed);

				Vehicle v2=new Vehicle();
				System.out.println("vehicle name:"+v2.name+" colour:"+v2.colour+" speed "+v2.speed);
				v2.name="Scooter";
				v2.colour="red";
				v2.speed=70.5;
				System.out.println("vehicle name:"+v2.name+" colour:"+v2.colour+" speed "+v2.speed);

				Vehicle v3=new Vehicle();
				System.out.println("vehicle name:"+v3.name+" colour:"+v3.colour+" speed "+v3.speed);
				v3.name="Car";
				v3.colour="yellow";
				v3.speed=60;
				System.out.println("vehicle name:"+v3.name+" colour :"+v3.colour+" speed "+v3.speed);

	}

}
