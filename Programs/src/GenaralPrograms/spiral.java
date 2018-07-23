package GenaralPrograms;

import java.util.*;
public class spiral
{
public static void main(String x[])
{
	System.out.println("Enter the row:");
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	int mat[][]=new int[no][no];
	int count=1;
	int minrow=0;
	int maxrow=no-1;
	int mincol=0;
	int maxcol=no-1;
while(count<=no*no)
{
	for(int i=mincol;i<=maxcol;i++)
	{
		mat[minrow][i]=count;
		count++;
	}
	for(int j=minrow+1;j<=maxrow;j++)
	{
		mat[j][maxrow]=count;
		count++;
	}
	for(int k=maxcol-1;k>=mincol;k--)
	{
		mat[maxrow][k]=count;
		count++;
	}
	for(int l=maxrow-1;l>=minrow+1;l--)
	{
		mat[l][mincol]=count;
		count++;
	}
	minrow++;
	maxrow--;
	mincol++;
	maxcol--;
	
}
for(int i=0;i<mat.length;i++)
{
	for(int j=0;j<mat.length;j++)
	{
		System.out.print(mat[i][j]+"\t");
		
	}
	System.out.println();
}
	
}
}