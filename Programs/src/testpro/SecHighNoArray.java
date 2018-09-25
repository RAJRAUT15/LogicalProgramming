package testpro;
import java.util.*;
public class SecHighNoArray {
	public static void main(String x[])
	{
		System.out.println("Enter the Size Of Array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp;
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	int large=arr[1];
		if(arr[0]==arr[1])
		{
			large=arr[2];
		}
			
		System.out.println("\nSecond Largest no:"+large);
				
	}

}
