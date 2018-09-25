package GenaralPrograms;

public class invertmat {
public static void main(String x[])
{
	System.out.println("Before Invert:");
	int n=3;
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	int tem[][]=new int[3][3];
	int t=n-1;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			tem[i][j]=arr[t][j];
		}
		t--;
	}
	System.out.println("After Invert:");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(tem[i][j]+" ");
		}
		System.out.println();
	}
}
}
