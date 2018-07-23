package GenaralPrograms;
import java.util.*;
public class pat {
	public static void main(String x[])
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No:");
		no=sc.nextInt();
		for(int i=no;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
