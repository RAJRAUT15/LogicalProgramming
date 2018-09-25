package GenaralPrograms;
import java.util.*;
public class onedarray {
	public static void main(String x[])
	{
		int n;
			System.out.println("Enter the array size");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int l=0;l<n;l++)
	{
		System.out.print(a[l]);
	}
	System.out.println("Enter the Shift no");
	int sf=sc.nextInt();
	int t=n;
	for(int j=0;j<sf;j++)
	{
		for(int m=0;m<j;m++)
		{
		a[t-1]=a[j];
		a[j]=a[j+1];
		}
		t--;
	}
	System.out.println("Rotated Array:");
	for(int k=0;k<n;k++)
	{
		System.out.print(a[k]);
	}
	}

}
