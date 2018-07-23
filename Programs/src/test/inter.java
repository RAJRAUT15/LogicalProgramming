package test;
import java.util.*;
public class inter
{
	public static void main(String x[])
	{
		System.out.println("Enter the No:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
			count++;
			}
		}
		if(count==2)
		{
			System.out.println("It is Prime No");
			
		}
		else
		{
			System.out.println("It is Not Prime number");
		}
	}
}