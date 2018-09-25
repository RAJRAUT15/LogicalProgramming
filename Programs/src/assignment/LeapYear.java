package assignment;
import java.util.*;
public class LeapYear {
	public static void main(String x[])
	{
		System.out.println("Enter the Year:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		boolean flag;
		if(year%400==0)
		{
			flag=true;
		}
		else if(year%100==0)
		{
			flag=false;
		}
		else if(year%4==0)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		if(flag)
		{
			System.out.println("It Is Leap Year:");
			
		}
		else
		{
			System.out.println("It Is not Leap Year:");
		}
		
		
	}

}
