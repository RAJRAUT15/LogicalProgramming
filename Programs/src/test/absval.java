package test;

public class absval {
	public static void main(String x[])
	{int s=3,i,j; 
		for(i=s;i>=-s;i--)
		{
			for(j=s;j>=Math.abs(i);j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
	}

}
