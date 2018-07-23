package GenaralPrograms;
import java.util.*;
public class anticlock {
	
	public static void main(String x[])
	{
		System.out.println("Enter the No:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mat[][]=new int[n][n];
		int minrow=0;
		int maxrow=n-1;
		int mincol=0;
		int maxcol=n-1;
		int count=n*n;
		while(count>0)
		{
			for(int i=maxcol;i>=mincol;i--)
			{
				mat[minrow][i]=count;
				count--;
			}
			for(int j=minrow+1;j<=maxrow;j++)
			{
				mat[j][minrow]=count;
				count--;	
			}
			for(int k=mincol+1;k<=maxcol;k++)
			{
				mat[maxrow][k]=count;
				count--;
			}
			for(int l=maxrow-1;l>=minrow+1;l--)
			{
				mat[l][maxcol]=count;
				count--;
			}
			maxcol--;
			mincol++;
			minrow++;
			maxrow--;
			
		}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(mat[i][j]+"\t");
				}
				System.out.println();
				
			}
		
		
	}

}
