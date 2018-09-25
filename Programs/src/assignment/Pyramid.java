package assignment;

public class Pyramid {
	public static void main(String x[])
	{int no=10;
		for(int i=0;i<=no;i++)
		{
			for(int k=no;k>=i;k--)
			{
			System.out.print(" ");	
			}
		
			for(int j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

			
	}

}
