package GenaralPrograms;
import java.util.*;
public class palindromno {
	public static void main(String x[])
	{
		int no,sm=0,rem,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No:");
		no=sc.nextInt();
		temp=no;
		while(no>0)
		{
			rem=no%10;
			sm=(sm*10)+rem;
			no=no/10;
		}
		if(temp==sm)
		{
			System.out.println("This No is Palindrome");
		}
		else
		{
			System.out.println("This No Is Not Palindrome");
		}
	}
	

}
