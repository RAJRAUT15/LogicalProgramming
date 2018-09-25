package test;
import java.util.*;
public class RecIfWithoutLoop {
	static int sum=0;
	static void recursive(int no)
	{int a=1;
		if(a<=no)
		{
			System.out.println(a);
			a++;
			recursive(no);
			sum+=a;
		}
			
	}
	public static void main(String x[])
	{
		System.out.println("Enter the Limit:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
	recursive(no);
	System.out.println("Sum="+sum);
	}

}
