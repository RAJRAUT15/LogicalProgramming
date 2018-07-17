package GenaralPrograms;
import java.util.*;

public class primeseq {
public static void main(String x[])
{
	int lm,no=1,sum=1122333445;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr the Limit:");
	lm=sc.nextInt();
	for(int i=0;i<lm;i++)
	{
		int count=0;
		for(int j=1;j<=no;j++)
		{
			if(no%j==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.print(no+" ");
				sum=sum+no;
			}
			
		
		no++;
		
	}
	System.out.println("\nSum Of Prime No is="+sum);
}
}
