package Pattern;
import java.util.*;
public class Arm {
public static void main(String x[])
{
	System.out.println("Enter the no:");
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	int dg=0;
	int temp=no;
	int rem,sum=0;
	while(no>0)
	{
		dg++;
		no/=10;
	}
	no=temp;
	while(no>0)
	{
		rem=no%10;
		sum=sum+power(rem,dg);
		no/=10;
		
	}
	if(sum==temp)
	{
		System.out.println("Armstrong No:");
	}
	else
	{
		System.out.println("Not Armstrong No:");
	}
}
static int power(int rm,int dig)
{int m=1;
	for(int i=0;i<dig;i++)
	{
		m=m*rm;
	}
	return m;
}
}
