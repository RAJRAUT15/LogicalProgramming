package assignment;
import java.util.*;
public class Factorial {
public static void main(String x[])
{
int fact=1,no,i = 1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the No:");
no=sc.nextInt();
while(i<=no)
{
	fact=fact*i;
	i++;
}
System.out.println("Factoral Of "+no+" Is " +fact);
}
}
