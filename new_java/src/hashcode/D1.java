package hashcode;

public class D1 {
int i;
char j;
D1()
{}
D1(int i, char j)
{
this.i=i;
this.j=j;
}
public boolean equals(Object ob)
{
	D1 temp=(D1)ob;
	return this.i==temp.i && this.j==temp.j;
}
public int hashCode()
{
	int hc=0;
	hc=i+j;
	return hc;
}

}
