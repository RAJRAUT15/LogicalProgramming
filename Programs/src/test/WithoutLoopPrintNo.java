package test;
class ob1{
	
public void obl(int count)
{

	if(count<=10)
	{
		System.out.println(count);
		count++;
		obl(count);
	
	}
}
}
public class WithoutLoopPrintNo {
	public static void main(String x[])
	{int count=1;
ob1 ob=new ob1();
ob.obl(count);
	}

}
