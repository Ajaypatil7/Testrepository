package com.arraylistprograms;

public class Student {
	
		int rollno;
		int std;
		Student()
		{}

	      Student(int rollno, int std)
		{
			this.rollno= rollno;
			this.std=std;
		}

		public String toString()
		{
			return "Student rollno :"+rollno+" std "+std;
		}

	}


