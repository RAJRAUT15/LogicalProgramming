package GenaralPrograms;
import java.util.*;
public class palindromstr {
public static void main(String x[])
{
	String str,rev="";
	int length;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	str=sc.nextLine();
	length=str.length();
	for(int i=length-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	if(str.equals(rev))
	{
		System.out.println("this string is palindrome");
	}
	else
	{
		System.out.println("This String is not Palindrome");
	}
}
}
