package GenaralPrograms;

public class BinarySearch {
	int binarysearch(int arr[],int l,int r,int x)
	{
		if(r>=1)
		{
			int mid=l+(r-l)/2;
			if(arr[mid]==x)
			{
				return mid;
				
			}
			if(arr[mid]>x)
			{
				return binarysearch(arr,l,mid-1,x);
				
			}
			return binarysearch(arr,mid+1,r,x);
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch ob=new BinarySearch();
		int arr[]= {2,3,4,10,40};
		int n =arr.length;
		int x=10;
		int result=ob.binarysearch(arr,0,n-1,x);
		if(result==-1)
		System.out.println("Element not Present");
		else
			System.out.println("Element Found At index"+result);
		
				

	}

}
