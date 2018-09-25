package Pattern;

public class pat4 {
public static void main(String x[])
{
	for(int i=3;i>=0;i--)
	{
		for(int j=3;j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	for(int i=3;i>=1;i--)
	{int k=3;
		for(int j=1;j<=i;j++)
		{
			System.out.print(k);
			k--;
		}
		System.out.println();
	}
}

}
