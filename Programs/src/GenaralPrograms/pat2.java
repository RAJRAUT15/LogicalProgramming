package GenaralPrograms;
import java.util.*;
public class pat2 {
	public static void main(String x[])
	{
		System.out.println("Enter the No:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=no;i>=0;i--)
		{
			for(int j=i;j>=0;j--,j--)
			{
			System.out.print(j);
			
			}
			System.out.println();
			
		}
		
	}

}
