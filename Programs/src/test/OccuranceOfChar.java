package test;
import java.util.*;
public class OccuranceOfChar {
	public static void main(String x[])
	{
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.replace(" ", "");
		char st[]=new char[str.length()];
		int find=0;
		for(int i=0;i<str.length();i++)
		{
			st[i]=str.charAt(i);
			for(int j=0;j<str.length();j++)
			{
				if(st[i]==str.charAt(j)) {
					find++;
				}
			}
			if(find>0)
			{
				System.out.println(str.charAt(i)+"="+find);
			}
			find=0;
		}
	}

}
