package testpro;
import java.util.*;
public class Bublesort {
	public void Bublesort(int arr[])
	{
		int len=arr.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(arr[j]<arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
	}
	public void printno(int arr[])
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String x[])
	{
		Bublesort ob=new Bublesort();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the Nos in array:");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	ob.Bublesort(arr);
	ob.printno(arr);
	}

}
