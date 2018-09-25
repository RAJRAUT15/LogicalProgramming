package assignment;
import java.io.*;
import java.util.*;
public class DuckNo {
	static int duckcheck(String st)
	{
		int len=st.length();
		int count=0;
		char ch;
		for(int i=0;i<len;i++)
		{
			ch=st.charAt(i);
			if(ch=='0')
			{
				count++;
			}
		}
		return count;
	}
public static void main(String x[]) throws Exception
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no:");
	String str=sc.nextLine();
	char first=str.charAt(0);
	int check=duckcheck(str);
	System.out.println(check);
	if(first=='0'||check==0)
	{
		System.out.println("Given Number Is not Duck No:");
	}
	else
	{
		System.out.println("Given No Is Duck No..");
	}
	
	
	
}

}
