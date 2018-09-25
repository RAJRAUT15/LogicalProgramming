package test;
import java.util.*;
public class WithoutLength {
public static void main(String x[])
{
System.out.println("Enter The String:");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int a=0;
for(char c:str.toCharArray()) {
	a++;
}
System.out.println("Length Of String:"+a);
}
}
