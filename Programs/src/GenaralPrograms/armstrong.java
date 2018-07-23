package GenaralPrograms;

import java.util.Scanner;

public class armstrong {
	static int power(int rm,int dg)
	{int m=1;
		for(int i=1;i<=dg;i++)
		{
		 m=m*rm;
		}
		return m;
	}
	public static void main(String x[])
	{
		System.out.println("Enter the No");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int temp,rem,sum=0,digit=0;
		temp=no;
		while(temp!=0)
		{
			digit++;
			temp/=10;
		}
		temp=no;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+power(rem,digit);
			temp/=10;
		}
		if(sum==no)
		{
			System.out.println("It is armstrong No...");
		}
		else
		{
			System.out.println("It is not Armstrong No..");
		}
	}

}
