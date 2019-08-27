package com.nonstaticmembers;

public class School {

	public static void main(String[] args) {
		Student s1;
		s1=new Student();
		System.out.println("Student name:"+s1.name+" Marks:"+s1.marks);

		Student s2=new Student();
		System.out.println("Student name:"+s2.name+" Marks:"+s2.marks);
		s2.name="chiku";
		s2.marks=70;
		System.out.println("Student name:"+s2.name+" Marks:"+s2.marks);

	   Student s3=new Student();
		s3.name="chikki";
		s3.marks=80;
		System.out.println("Student name:"+s3.name+" Marks:"+s3.marks);

	}

}
