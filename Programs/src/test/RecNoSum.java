package test;

public class RecNoSum {
	static int sum=0;
	static int recursive(int no)
	{
		int rem;
		if(no>0)
		{
			rem=no%10;
			sum=sum+rem;
		
			recursive(no/10);
		}
		return sum;

	}
	public static void main(String x[])
			{
		System.out.println(recursive(123456789));
		
			}

}
