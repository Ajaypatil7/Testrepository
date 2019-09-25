package hashcode;

public class D2 extends D1 {
boolean f;
String s;
D2(){
	}

D2(int i, char j, boolean f, String s)
{
	super(i,j);
	this.f=f;
	this.s=s;
}
public boolean equals(Object ob)
{
	D2 temp=(D2)ob;
	return super.equals(temp) && this.s.equals(temp.s);// && this.f==temp.f;
}
public int hashCode()
{
	int hc=0;
	if(f)
	{
		hc=1;	
	}
	else 
		hc=0;
	hc=hc+s.hashCode()+super.hashCode();
	return hc;
}

}
