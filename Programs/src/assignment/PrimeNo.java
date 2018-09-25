package assignment;
import java.util.*;
public class PrimeNo {
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the No:");
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
		System.out.println("Given No Is Prime No:");
	}
	else
	{
		System.out.println("Given No Is Not Prime No:");
	}
	
}
}
