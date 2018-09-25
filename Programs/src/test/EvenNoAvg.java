package test;
import java.util.*;

public class EvenNoAvg {
public static void main(String x[])
{
	System.out.println("Enter the No:");
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
int sum=0,count=0;
float avg;
int temp=1;
	while(temp<=no)
	{
		if(temp%2==0)
		{
			count++;
			sum+=temp;
			System.out.println(temp);
		}
		temp++;
	}
	avg=sum/count;
	System.out.println("Avarage:"+avg);
}
}
