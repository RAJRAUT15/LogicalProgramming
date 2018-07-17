package GenaralPrograms;
import java.util.*;
public class perfect {
	public static void main(String x[])
	{
		int no,sum=0,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		no=sc.nextInt();
		
		while(i<no)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
			if(sum==no)
			{
				System.out.println("Given no is perfect no");
			}
			else
			{
				System.out.println("given no is not perfect no:");
				
			}
		}
		
	}

