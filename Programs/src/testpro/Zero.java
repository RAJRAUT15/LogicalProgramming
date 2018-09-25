package testpro;
import java.util.*;
public class Zero {
	static int prime(int num)
	{
		int maxprime=-1;
	while(num%2==0)
	{
		maxprime=2;
		num>>=1;
	}
		for(int i=3;i<=Math.sqrt(num);i=i+2)
		{while(num%i==0)
		{
	maxprime=i;
	num=num/i;
		}
		}
		
			if(num>2)
			{
				maxprime=num;
			}	
			return maxprime;
	}
	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No:");
		int num=sc.nextInt();
		
		int primeno=prime(num);
		System.out.println(primeno);
		int temp=num;
		int count=0;
		while(temp>=0)
		{
			
			if(temp%primeno==0)
			{
				temp=primeno;
				count++;
			}
			else {
				temp=temp-1;
				count++;
			
			}
			primeno=prime(temp);
			
		}
		System.out.println("Count: "+count);
	}

}
