package GenaralPrograms;

public class transpose {
public static void main(String x[])
{int n=3;
	System.out.println("Matrix Before Transpose:");
	int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++) 
		{
			System.out.print(mat[i][j]+" ");
		} 
		System.out.println();
	}
	System.out.println("Matrix After Transpose");
	int tmat[][]=new int[3][3];
	
	for(int i=0;i<n;i++)
	{int m=n-1;
		
		for(int j=0;j<n;j++)
		{
			tmat[i][j]=mat[m][i];
		m--;
		}
		
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(tmat[i][j]+" ");
		}
	System.out.println();
		
	}
}
}
