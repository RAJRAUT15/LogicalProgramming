package test;
class test implements Runnable
{
	public void run()
	{
for(int i=0;i<5;i++)
{
	System.out.println("\t My Thread:");
}
	}
}
public class Thred {
	public static void main(String x[])
	{
		test1 ob=new test1();
		Thread t=new Thread(ob);
		t.start();
		for(int j=0;j<=5;j++)
		{
			System.out.println("Main Thread");
		}
	}

}
