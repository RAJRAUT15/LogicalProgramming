package testpro;
import java.util.*;

public class Perfectcube {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter the Limit:");
		int lim=sc.nextInt();
		int cube;
		for (int i=1;i*i*i<=lim;i++)
		{
			cube=i*i*i;
         if(cube<=lim)
         {
        	 System.out.println(cube);
         }
		}
		
	}

}
