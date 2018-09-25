package test;
class Raj
{int a,b,c;
	Raj()
	{
		System.out.println("In Default:");
	}
	Raj(int k,int p)
	{
		a=k;
		b=p;
		System.out.println("In parameterized");
	}
	int add()
	{ 
		return a+b;
	}
}
public class Constr {
	public static void main(String x[]) {
		//Raj obj=new Raj();
		Raj obj2=new Raj(1,3);
		
		System.out.println(obj2.add());
		
		
	}
	
	
	
	

}
