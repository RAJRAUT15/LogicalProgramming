package GenaralPrograms;
import java.util.*;
public class frog {
	public static void main(String x[])
	{
		int hour,step=2,total;
		System.out.println("Enter the Hours:");
		Scanner sc=new Scanner(System.in);
		hour=sc.nextInt();
		total=step*hour;
		
		if(hour>=3)
		{
			int slice;
			slice=hour/3;
			total=total-(slice*3);
			System.out.println("Total Steps= "+total);
		}
		else
		{
			System.out.println("Total Steps= "+total);
		}
	}

}
