package test;
import java.util.*;
public class CompareSort {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		int size=sc.nextInt();
		String str[]=new String[size];
		String temp=null;
		System.out.println("Enter the String:");
		for(int i=0;i<size;i++)
		{
			str[i]=sc.nextLine();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(str[i]);
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(int i=size-1;i>=0;i--)
		{
			System.out.println("\n"+str[i]);
		}
	}

}
