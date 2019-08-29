package com.nonprimitivearray;

public class Company {
	
	public static void main(String[] args) {
		Employee[] employee = new Employee[5];
   employee[0] = new Employee(1,"Shera",2);
   employee[1] = new Employee(2,"Baghira",1.2);
   employee[2] = new Employee(3,"Mowgly",3.2);
   employee[3] = new Employee(4,"Bhalu",4.0);
   employee[4] = new Employee(5,"Moti",3.2);
   for(int i=0;i<employee.length;i++)
   {
	   System.out.println("Employee id:"+employee[i].id+"\n name:"+employee[i].name+"\n salary:"+employee[i].salary);
   System.out.println("++++++++");
   }
   
   
   
   
   
	}

}
