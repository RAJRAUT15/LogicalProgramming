package testpro;
import java.util.*;
public class FindOccurance {
	static final int max=256;
	static void getoccur(String st)
	{
		int count[]=new int[max];
		int len=st.length();
		for(int i=0;i<len;i++)
		{
			count[st.charAt(i)]++;
		}
		char ch[]=new char[st.length()];
		for(int i=0;i<len;i++)
		{ch[i]=st.charAt(i);
			int find=0;
			for(int j=0;j<len;j++)
			{
				if(st.charAt(i)==ch[j])
				{
					find++;
				}
				
			}
			if(find==1)
			{
				System.out.println("Occurance of Character "+st.charAt(i)+" is "+count[st.charAt(i)]);
			}
		}
	}
	public static void main(String x[]) {
		System.out.println("Enter The String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		getoccur(str);
		
	}

}
