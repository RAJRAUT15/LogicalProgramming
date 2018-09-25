package GenaralPrograms;
import java.util.*;
public class rotatea {
	 void leftrotate(int arr[],int sf,int n)
	{
		for(int j=0;j<sf-1;j++)
		{
			rotatearray(arr,n);
		}
			}
	 void rotatearray(int arr[],int n)
	{
		int j,temp;
		temp=arr[0];
		for(j=0;j<n-1;j++)
		{
			arr[j]=arr[j+1];
			
		}
		arr[j]=temp;
	}
	 void printarray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String x[])
	{
	rotatea rot=new rotatea();
		System.out.println("Enter the Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Nos:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n=arr.length;
		System.out.println("Enter the No to Shift:");
		int sf=sc.nextInt();
		rot.leftrotate(arr,sf,n);
		rot.rotatearray(arr,n);
		rot.printarray(arr, n);
				
	}

}
