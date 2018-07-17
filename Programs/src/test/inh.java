package test;
class cal
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
class advcal extends cal
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}
class vryadcal extends advcal
{
	public int mul(int i,int j)
	{
		return i*j;
	}
}

public class inh {
public static void main(String x[])
{
	vryadcal ob=new vryadcal();
	int result1=ob.add(5,6);
	int result2=ob.sub(10,5);
	int result3=ob.mul(20,40);
	System.out.println("Add: "+result1+"\nSub: "+result2+"\nMul: "+result3);
}
}
