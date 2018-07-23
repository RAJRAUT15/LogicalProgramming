package GenaralPrograms;
import java.util.*;
public class factorial {
	public static void main(String x[])
	{
		System.out.println("Enter the No:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of " +no+" is " +fact);
	}

}
