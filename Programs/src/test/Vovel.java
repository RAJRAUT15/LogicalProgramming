package test;
import java.util.*;
public class Vovel {
	public static void main(String x[])
	{
		System.out.println("Enter the String:");
				Scanner sc=new Scanner(System.in);
				String str=sc.nextLine();
				String str1="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
		{
			str1=str1+ch;
		}
	}
	System.out.println("String Without Vovels:"+str1);
	}

}
