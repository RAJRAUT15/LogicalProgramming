package assignment;
import java.io.*;
public class GreaterNo {
	public static void main(String x[]) throws Exception
	{
		System.out.println("Enter The Nos:");
		DataInputStream d=new DataInputStream(System.in);
		int no1=Integer.parseInt(d.readLine());
		int no2=Integer.parseInt(d.readLine());
		int no3=Integer.parseInt(d.readLine());
		if(no1>no2)
		{
			if(no1>no3)
			{
				System.out.println("No1 Is Greater:"+no1);
			}
			else
			{
				System.out.println("No3 Is Greater"+no3);
			}
			
		}
		else
		{
			if(no2>no3)
			{
			System.out.println("No2 is Greater"+no2);
			}
			else
			{
				System.out.println("NO3 Is Greater"+no3);
			}
		}
	}

}
