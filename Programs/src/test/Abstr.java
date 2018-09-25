package test;
abstract class a
{
	abstract void sp();
	
}
abstract class b extends a
{
	abstract void kp();
	void sp()
	{
		System.out.println("class a");
	}
}
class c extends b
{
	void kp()
	{
		System.out.println("class b");
	}
	void np()
	{
		System.out.println("raj");
	}
}
public class Abstr {
	public static void main(String x[])
	{
		c ob=new c();
		ob.sp();
		ob.np();
	}

}
