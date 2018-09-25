package test;

import java.util.Scanner;

public class CheckVovels {
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String:");
	String str=sc.nextLine();
	int len=str.length();
	for(int i=0;i<len;i++)
	{
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch);
		}
	}
}
}
