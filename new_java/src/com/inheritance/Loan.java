package com.inheritance;

public class Loan {
String type;
double roi;
int tennure;
int amount;
Loan()
{
}
Loan(String type,double roi,int tennure)
{
	this.type=type;
	this.roi=roi;
	this.tennure=tennure;
}
int interest (int p)
{
	System.out.println("principle is :"+p);
	double amount1=(p*roi*tennure)/100;
	System.out.println("interest amount is: "+amount1);
	double interest=p+amount1; 
  
    amount=(int)interest;//type casting narrowing 
    return amount;
}

}
