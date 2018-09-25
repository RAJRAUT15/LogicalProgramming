package test;

import java.util.Scanner;

public class SpecConNo {
	
	
	
	public static void main(String x[])
	{
		System.out.println("Enetr the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String temp="";
		int arr[]=new int[str.length()];
		
		for(int k=0;k<str.length();k++)
		{
			temp=temp+str.charAt(k);
			arr[k]=Integer.parseInt(temp);
			temp="";
		}
		int flag=0;
		for(int i=0;i<str.length()-2;i++)
		{
				
			for(int j=i;i<str.length();j++)
			{
				if(arr[i]==arr[i+1]-1&&arr[i]==arr[i+2]-2)
				{
					flag=1;
					break;
							
				}
				else if(arr[i]==arr[i+1]+1&&arr[i]==arr[i+2]+2)
				{
					flag=1;
					break;
				}
				
				else if(arr[i]==arr[i+1]&&arr[i]==arr[i+2])
				{
					flag=1;
					break;
					
				}
				
				else
				{
					flag=0;
					break;
				}
				
			}
			if(flag==1)
			{
				break;
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
