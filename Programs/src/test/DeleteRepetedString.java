package test;
import java.util.*;
public class DeleteRepetedString {
	public static void main(String x[])
	{
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		String temp="";
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					arr[j]="";
				}
			}
			temp=temp+arr[i]+" ";
			
		}
		System.out.println(temp);
	}

}
