package hashcode;

public class HC2 {

	String s;
	HC2()
	{	
		
	}
	HC2(String s) 
	{
this.s=s;
}
	
public boolean equals(Object ob)
{
	return this.s.equals(((HC2)ob).s);
}
public int hashCode()
{
	return this.s.hashCode();
}

public static void main(String[] args) {

	HC2 h1= new HC2("ABC");
	HC2 h2= new HC2("ABC");
	


	System.out.println(h1.equals(h2));
	
	System.out.println(h1.hashCode());
	System.out.println(h2.hashCode());
	

}
}