package testpro;
import java.util.*;
public class RotateMatrix90 {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Matrix:");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		int temp[][]=new int[size][size];
		for(int i=0;i<size;i++)
		
		{
			for(int j=0;j<size;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int n=size-1;
		for(int k=0;k<size;k++)
		{
			for(int l=0;l<size;l++)
			{
				temp[k][l]=arr[l][n];
			}
			n--;
		}
		System.out.println("Matrix After 90 degree rotate:");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
