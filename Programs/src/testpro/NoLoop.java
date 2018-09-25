package testpro;
import java.util.*;
public class NoLoop {
	public static void main(String x[])
	{
		System.out.println("Enter the No:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			for(int j=0;j<=no;j++)
			{int num=i;
				if(j==no&&i%2==1) {
					num=num+1;
			} 
			if(j==0&&i%2==0)
			{
				num+=1;
			}
				System.out.print(num);
			}
			System.out.println();
		}
	}

}
