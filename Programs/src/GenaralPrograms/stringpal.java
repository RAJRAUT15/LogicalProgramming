package GenaralPrograms;
import java.util.*;
public class stringpal {
	public static void main(String x[])
	{
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		String str2="";
				
		for(int i=len-1;i>=0;i--)
		{
			str2=str2+str.charAt(i);
		}
		System.out.println(str2);
		if(str2.equals(str))
		{
			System.out.println("Given String Is palimdrome....");
		}
		else
		{
			System.out.println("Given String Is not Palimdrome...");
		}
	}

}
