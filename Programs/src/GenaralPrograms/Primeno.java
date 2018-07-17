package GenaralPrograms;
import java.util.*;
public class Primeno {
public static void main(String x[])
{
	int no,count=0;
	System.out.println("Enter the no:");
	Scanner sc=new Scanner(System.in);
	no=sc.nextInt();
	for(int i=1;i<=no;i++)
	{
		if(no%i==0)
		{
			count++;
			
		}
	}
		if(count==2)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is Not Prime:");
		}
	
}
}
