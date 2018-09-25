package test;
import java.util.*;
public class NameAbb {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		str=str.toUpperCase();
		String star[]=str.split(" ");
		String tmp="";
		String res="";
		
		for(int i=star.length-1;i>=0;i--)
		{
			char tm[]=star[i].toCharArray();
		
			if(i==1)
			{
				tmp=String.valueOf(tm[0]);
			//System.out.println(tmp);
				star[i]=tmp;
				tmp="";
			}
			
			if(i==0) {
				tmp=String.valueOf(tm[0]);
				//System.out.println(tmp);
				star[i]=tmp;
			}
			
		}
		String ts=star[1];
		star[1]=star[0];
		star[0]=ts;
		for(int j=star.length-1;j>=0;j--)
		{
			res=res+star[j]+" ";
		}
		System.out.print(res);
		
	}

}
