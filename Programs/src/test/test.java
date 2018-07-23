package test;
import java.util.*;

public class test
{
	public static void main(String x[])
	{
		System.out.println("Enter the no:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int rev=0,rem,temp;
		temp=no;
		while(no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(rev==temp)
		{
		System.out.println("Its is Palimdrome");
		}
		else
		{
			System.out.println("It is not palimdrom ");
		}
	}
}