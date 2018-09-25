package assignment;
import java.util.*;
public class Armstrong100 {
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Limit:");
int lim=sc.nextInt();
int no,sum=0,rem=0,digit=0;
for(int i=1;i<=lim;i++)
{
	no=i;
	while(no>0)
	{
		digit++;
		no/=10;
	}
	
	no=i;
	sum=0;
	while(no>0)
	{
		rem=no%10;
		sum=sum+(rem*rem*rem);
		no/=10;
	}
	if(sum==i)
	{
		System.out.println(sum);
	}
	sum=0;
	no=0;
	rem=0;
}
}
}
