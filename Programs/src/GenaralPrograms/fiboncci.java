package GenaralPrograms;
import java.util.*;
public class fiboncci {
public static void main(String x[])
{
	int a=0,f=0,s=1,sum;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the No:");
	a=sc.nextInt();
	System.out.print("Nos Between 0 to "+a+"\n");
	for(int i=0;i<=a;i++)
	{
		if(f<=a)
		{
		System.out.print(f+" ");
		sum=f+s;
		f=s;
		s=sum;
		}
	}
}
}
