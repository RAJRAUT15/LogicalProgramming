package assignment;
import java.util.*;

public class InverseMatrix {
	public static void main(String x[])
	{
		System.out.println("Enter the Dimension Size Of Matrix:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		int temp[][]=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				arr[i][j]=sc.nextInt();
				temp[i][j]=arr[i][j];
			}
		}
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
	System.out.println("Inverse Matrix:");
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
			temp[j][i]=arr[i][j];
			
		}
	
	}
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
			System.out.print(temp[i][j]);;
			
		}
		System.out.println();
	
	}
	}

}
