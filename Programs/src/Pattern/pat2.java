package Pattern;
import java.util.*;

public class pat2 {
public static void main(String x[])
{int no=5,count=1; 
	for(int i=0;i<no;i++)
	{
		for(int j=no;j>i;j--)
		{
			System.out.print(" ");
		}
	for(int k=0;k<count;k++)
	{
		System.out.print(count-k);
	
	}
	count+=2;
		System.out.println();
	}
}
}
