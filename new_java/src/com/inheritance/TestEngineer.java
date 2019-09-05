package com.inheritance;

public class TestEngineer extends Employee {
String tool;
void writesScripts()
{
	System.out.println("test engineer is writing scripts using tool:"+tool);
}

TestEngineer(String name,double salary,String tool)
{
 super(name,salary);
 this.tool=tool;
}

	public static void main(String[] args) {
		
     TestEngineer te1=new TestEngineer("Ajay",20.8,"selenium");
    		System.out.println("id:"+te1.id+" name:"+te1.name+" salary:"+te1.salary+" tool:"+te1.tool);
		te1.writesScripts();
	
	}

}
