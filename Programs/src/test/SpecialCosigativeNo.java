package test;
import java.util.*;
public class SpecialCosigativeNo {
public static void main()
{
	System.out.println("Enetr the String:");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int flag=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		
		for(int j=i;i<str.length();j++)
		{
			char ch1=str.charAt(j);
			if(ch==str.charAt(j+1))
			{
				flag=1;
						
			}
			else
			{
				flag=0;
			}
			if(ch==str.charAt(i+1)+1||ch==str.charAt(i+2)+2)
			{
				flag=1;
			}
			else
			{
				flag=0;
			}
			if(ch==str.charAt(i+1)||ch==str.charAt(i+2)+2)
			{
				flag=1;
			}
			else
			{
				flag=0;
			}
			
		}
		if(flag==1)
		{
			System.out.println("It Is Special No:");
		}
		else
		{
			System.out.println("Normal No:");
		}
		
	}
	
}
}
