package hashcode;

public class MainClass {

	public static void main(String[] args) {
   D1 ob1=new D1(10,'a');
   D1 ob2=new D1(10,'a');
   System.out.println(ob1.equals(ob2));
   System.out.println(ob1.hashCode());
   System.out.println(ob2.hashCode());
   System.out.println("**************");
   
   D2 ob3=new D2(10,'a',true,"ABC");
   D2 ob4=new D2(10,'a',false,"ABC");
   System.out.println(ob3.equals(ob4));
   System.out.println(ob3.hashCode());
   System.out.println(ob4.hashCode());
   System.out.println("**************");
   
   D3 ob5=new D3(10,'a',false,"ABC",10.0);
   D3 ob6=new D3(10,'a',false,"ABC",10.0);
   System.out.println(ob5.equals(ob6));
   System.out.println(ob5.hashCode());
   System.out.println(ob6.hashCode());
   System.out.println("**************");
   
	}

}
