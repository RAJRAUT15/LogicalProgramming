package assignment;
import java.util.*;
public class Fibbonee {
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limt:");
	int lim=sc.nextInt();
	int f1=0,f2=1,f3=0;
	for(int i=0;i<lim;i++)
	{
		System.out.print(" "+f1);
		f3=f1+f2;
		f1=f2;
		f2=f3;
	}
}
}
