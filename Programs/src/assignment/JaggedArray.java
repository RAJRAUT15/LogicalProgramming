package assignment;
import java.util.*;
public class JaggedArray {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int sz=sc.nextInt();
		System.out.println("Enter The No:");
		int arr[][]=new int[sz][];
		int tm=sz-1;
		for(int k=0;k<sz;k++)
		{
		arr[k]=new int[tm];
		tm--;
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}

}
