package GenaralPrograms;
import java.util.*;
public class stringpat {
public static void main(String x[])
{
	System.out.println("Enter the String: ");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int len=str.length();
	String str2="";
String st[]=str.split(" ");
int len2=st.length;
String rev="";
for(int i=len-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
	
}
System.out.println(rev);
String rev2="";
for(int j=len2-1;j>=0;j--)
{
	rev2=rev2+st[j]+" ";
}
System.out.println(rev2);
String rev3="";
for(int k=len-1;k>=0;k--)
{
	rev3=rev3+rev2.charAt(k);
}
	System.out.println(rev3);
}

}
