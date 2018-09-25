package assignment;
import java.util.*;
public class Percentage {
	public static void main(String x[])
	{Scanner sc=new Scanner(System.in);
		int sub[]=new int[6];
		float sum=0;
		float per=0;
		System.out.println("Enter the subject Marks:");
		for(int i=0;i<6;i++)
		{
			sub[i]=sc.nextInt();
			if(sub[i]>100)
			{
				System.out.println("Enter the Valid Marks");
				sub[i]=sc.nextInt();
			}
		}
		System.out.print("Total Marks:");
		for(int j=0;j<6;j++)
		{
			sum=sum+sub[j];
		}
		System.out.println(+sum);
		per=(sum/600)*100;
		System.out.println("Percentage: "+per);
	}

}
