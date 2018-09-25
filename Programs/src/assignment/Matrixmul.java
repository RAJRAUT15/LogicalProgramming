package assignment;
import java.util.*;
public class Matrixmul {
	public static void main(String x[])
	{
		System.out.println("Enter the first matrix :");
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Second Matrix:");
		int arr1[][]=new int[3][3];
		int res[][]=new int[3][3];
		for(int k=0;k<3;k++)
		{
			for(int l=0;l<3;l++)
			{
				arr1[k][l]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
			res[i][j]=0;
				for(int k=0;k<3;k++)
				{
					res[j][k]+=arr[i][j]*arr1[j][k];
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+res[i][j]);
			}
			System.out.println();
		}
	}

}
