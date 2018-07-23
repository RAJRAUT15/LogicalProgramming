package GenaralPrograms;

public class duplicateNo {
	public static int fin(int arr[],int l)
	{
		if(l==0||l==1)
		{
			return l;
		}
		int j=0;
		for(int i=0;i<l-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j++]=arr[i];
			}
			else
			{
			System.out.print(arr[i]+"\n");
			}
		}
		arr[j++] = arr[l-1];
		return j;
		
	}
	public static void main(String x[])
	{
	int arr[]= {5,5,4,4,3,2,2,1};
	int length=arr.length;
	length=fin(arr,length);
	for(int i=0;i<length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	}

}
