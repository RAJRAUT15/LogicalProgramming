package test;
import java.util.*;
public class SmsString {
	public static void main(String x[])
	{
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		String temp="";
		for(int i=0;i<arr.length;i++)
		{
			char ch[]=arr[i].toCharArray();
			for(int j=0;j<ch.length;i++)
			{
				if(ch[j]=='y'&&ch[j+1]=='o'&&ch[j+2]=='u')
				{
					ch[j]='u';
					ch[j+1]=' ';
					ch[j+2]=' ';
				}
				if(ch[j]=='a'&&ch[j+1]=='r'&&ch[j+2]=='e')
				{
					ch[j]='r';
					ch[j+1]=' ';
					ch[j+2]=' ';
				}
				if(ch[j]=='t'&&ch[j+1]=='o'&&ch[j+2]=='d'&&ch[j+3]=='a'&&ch[j+4]=='y')
				{
					ch[j]='2';
					ch[j+1]='d';
					ch[j+2]='a';
					ch[j+2]='y';
				}
				arr[i]=String.valueOf(ch);
			}
			temp=arr[i]+" ";
		}
		System.out.println("SMS String:"+temp);
		
	}

}
