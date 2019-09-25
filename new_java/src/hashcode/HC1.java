package hashcode;

public class HC1 {

	int i;
	HC1()
	{	
		
	}
	HC1(int i) 
	{

	this.i=i;
}
	
public boolean equals(Object ob)
{
	return this.i==((HC1)ob).i;
}
public int hashCode()
{
	return i;
}

public static void main(String[] args) {

	HC1 h1= new HC1(100);
	HC1 h2= new HC1(101);
	HC1 h3 =new HC1(100);

	System.out.println(h1);
	System.out.println(h2);
	System.out.println(h3);
	System.out.println(h1.equals(h2));
	System.out.println(h1.equals(h3));
	System.out.println(h1.hashCode());
	System.out.println(h2.hashCode());
	System.out.println(h3.hashCode());

}
}
