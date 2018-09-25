package assignment;
import java.util.*;
public class ReverseNoWhile {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no=sc.nextInt();
		int temp,rem,rev=0;
		temp=no;
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no/=10;
		}
		System.out.println("Reverse No:"+rev);
	}

}
